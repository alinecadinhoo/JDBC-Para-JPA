/**
 * 
 */
package br.com.cadinho.dao;

import br.com.cadinho.dao.generic.IGenericDAO;
import br.com.cadinho.domain.Venda;
import br.com.cadinho.exceptions.DAOException;
import br.com.cadinho.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
