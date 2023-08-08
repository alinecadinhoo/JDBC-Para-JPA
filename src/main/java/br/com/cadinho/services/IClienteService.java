/**
 * 
 */
package br.com.cadinho.services;

import br.com.cadinho.domain.Cliente;
import br.com.cadinho.exceptions.DAOException;
import br.com.cadinho.services.generic.IGenericService;

/**
 *
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
