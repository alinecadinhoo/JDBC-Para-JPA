/**
 * 
 */
package br.com.cadinho.dao.jpa;

import br.com.cadinho.dao.generic.jpa.GenericJpaDAO;
import br.com.cadinho.domain.jpa.ClienteJpa;

/**
 *
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
