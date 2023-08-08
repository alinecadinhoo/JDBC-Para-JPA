/**
 * 
 */
package br.com.cadinho.services;

import br.com.cadinho.dao.IProdutoDAO;
import br.com.cadinho.domain.Produto;
import br.com.cadinho.services.generic.GenericService;

/**
 *
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
