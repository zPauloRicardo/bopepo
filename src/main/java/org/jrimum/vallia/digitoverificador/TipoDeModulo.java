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
 * Created at: 30/03/2008 - 18:51:20
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
 * Criado em: 30/03/2008 - 18:51:20
 * 
 */

package org.jrimum.vallia.digitoverificador;

import java.io.Serializable;

/**
 * Enumeração das implementações dos módulos.
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public enum TipoDeModulo implements Serializable {

	/**
	 * Módulo do tipo 11.
	 * 
	 * @since 0.2
	 */
	MODULO10 {
		/**
		 * @see TipoDeModulo#valor()
		 * @since 0.2
		 */
		public int valor() {
			return 10;
		}
	},

	/**
	 * Módulo do tipo 11.
	 * 
	 * @since 0.2
	 */
	MODULO11 {
		/**
		 * @see TipoDeModulo#valor()
		 * @since 0.2
		 */
		public int valor() {
			return 11;
		}
	};

	/**
	 * Retorna o valor do módulo.
	 * 
	 * @return 10 ou 11
	 * 
	 * @since 0.2
	 */
	public abstract int valor();
}