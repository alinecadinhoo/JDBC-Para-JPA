/**
 * 
 */
package br.com.cadinho.dao.jpa;

import br.com.cadinho.dao.generic.jpa.GenericJpaDAO;
import br.com.cadinho.domain.jpa.ProdutoJpa;

/**
 *
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
