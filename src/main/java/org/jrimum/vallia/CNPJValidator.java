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
 * Created at: 30/03/2008 - 18:19:49
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
 * Criado em: 30/03/2008 - 18:19:49
 * 
 */

package org.jrimum.vallia;

/**
 * Validador especialista para CNPJ.
 * 
 * <p>
 * O cadastro de pessoa jurídica tem as seguintes características:
 * <ul>
 * <li>Contém apenas números.</li>
 * <li>Possui tamanho 14 sem formatação e 18 com formatação.</li>
 * <li>Pode estar no formato ##.###.###/####-XX, onde XX é o dígito verificador.
 * </li>
 * </ul>
 * </p>
 * <p>
 * A validação consiste em verificar essas características e se o dígito
 * verificador é válido.
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author <a href="mailto:misaelbarreto@gmail.com">Misael Barreto</a>
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 * @author <a href="http://www.nordestefomento.com.br">Nordeste Fomento
 *         Mercantil</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
class CNPJValidator extends AbstractCPRFValidator {

	/**
	 * @see AbstractCPRFValidator#isValido()
	 * @since 0.2
	 */
	@Override
	public boolean isValido() {

		boolean isValido = false;
		int dv = 0;
		int dvCalculado = -1;

		dv = Integer.parseInt(getCodigoDoCadastro().substring(12, 14));

		dvCalculado = digitoVerificador.calcule(getCodigoDoCadastro()
				.substring(0, 12));

		isValido = (dv == dvCalculado);

		return isValido;
	}

	/**
	 * @see AbstractCPRFValidator#removeFormatacao()
	 * @since 0.2
	 */
	@Override
	protected void removeFormatacao() {

		String codigo = codigoDoCadastro.toString();

		codigo = codigo.replace(".", "");
		codigo = codigo.replace("/", "");
		codigo = codigo.replace("-", "");

		codigoDoCadastro.delete(0, codigoDoCadastro.length());

		codigoDoCadastro.append(codigo);
	}

}
