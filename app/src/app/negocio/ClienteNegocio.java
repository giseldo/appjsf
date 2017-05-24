package app.negocio;

import app.bean.Cliente;
import app.dao.ClienteDAO;

public class ClienteNegocio {

	public void salvarCliente(Cliente cliente) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.consultar(1);

		// if ele existir

		clienteDAO.salvar();

	}
}
