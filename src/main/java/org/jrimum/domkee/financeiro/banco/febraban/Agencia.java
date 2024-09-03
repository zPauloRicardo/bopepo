/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 18:57:33
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 18:57:33
 * 
 */

package org.jrimum.domkee.financeiro.banco.febraban;

import static org.apache.commons.lang.StringUtils.EMPTY;

import org.apache.commons.lang.StringUtils;
import org.jrimum.utilix.Exceptions;
import org.jrimum.utilix.Objects;


/**
 * <p>
 * Esta classe segue o padrão especificado pela FEBRABAN:
 * <br/>
 * Invariantes:
 * <ul>
 * <li>Código: deve ser um inteiro natural (incluindo zero) entre 1 e 5 dígitos</li>
 * <li>Dígito Verificador: alpha-numérico sendo um inteiro natural (incluindo zero)
 * ou caracter não vazio (' ') com um dígito.</li>
 * </ul>
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a> 
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 * @author <a href="mailto:misaelbarreto@gmail.com">Misael Barreto</a>
 * @author <a href="mailto:samuelvalerio@gmail.com">Samuel Valério</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class Agencia implements org.jrimum.domkee.financeiro.banco.Agencia<Integer, String> {

	private final Integer codigo;

	private final String digitoVerificador;
	
	public Agencia(Integer codigo) {

		this.codigo = codigo;
		verifyCodigo();
		this.digitoVerificador = EMPTY;
	}
	
	public Agencia(Integer codigo, String digito) {

		this.codigo = codigo;
		verifyCodigo();
		this.digitoVerificador = digito;
		verifyDv();
	}
	
	public void verifyCodigo() {

		if (codigo < 0 ) {
			Exceptions.throwIllegalArgumentException("O código da agência deve ser um inteiro natural (incluindo zero)");
		}
		
		if (String.valueOf(codigo).length() > 5) {
			Exceptions.throwIllegalArgumentException("O código da agência deve possuir de 1 a 5 dígitos");
		}
	}
	
	public void verifyDv(){
		
		if (StringUtils.isBlank(digitoVerificador)) {
			Exceptions.throwIllegalArgumentException("O dígito verificador da agência não pode ser null ou apenas espaços em branco");
		}
		
		if (digitoVerificador.length() > 1) {
			Exceptions.throwIllegalArgumentException("O dígito verificador da agência deve possuir apenas um dígito");
		}
			
		if (!StringUtils.isAlphanumeric(digitoVerificador)) {
			Exceptions.throwIllegalArgumentException("O dígito verificador da agência deve ser letra ou dígito");
		}
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}
	
	@Override
	public String toString() {
		return Objects.toString(this);
	}
}
