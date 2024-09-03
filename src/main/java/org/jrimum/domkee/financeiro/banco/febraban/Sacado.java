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
 * Created at: Jan 26, 2010 - 1:27:20 PM
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
 * Criado em: Jan 26, 2010 - 1:27:20 PM
 * 
 */

package org.jrimum.domkee.financeiro.banco.febraban;

import org.jrimum.domkee.comum.pessoa.id.cprf.CPRF;

/**
 * <p>
 * Representa um Sacado no modelo de negócio financeiro, que é 
 * aquele que emite um título de crédito a favor de alguém.
 * </p>
 * <p>
 * Pessoa física ou jurídica a que se destina a cobrança do compromisso, é o cliente do Cedente.
 * </p>
 * 
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class Sacado extends EntidadeDeCobranca {

	public Sacado(String nome) {
		super(nome);
	}
	
	public Sacado(String nome, String cadastroDePessoa) {
		super(nome, cadastroDePessoa);
	}
	
	public Sacado(String nome, CPRF cadastroDePessoa) {
		super(nome, cadastroDePessoa);
	}
	
}
