package app.presentation;

import javax.faces.bean.ManagedBean;

import app.bean.Cliente;
import app.negocio.ClienteNegocio;

@ManagedBean
public class CadastroMB {

	private String nome;

	public String getNome() {
		System.out.println("executou getnome");

		return nome;
	}

	public void setNome(String nome) {
		System.out.println("executou setnome");
		this.nome = nome;
	}

	public void salvar() {
		ClienteNegocio clienteNeg = new ClienteNegocio();
		clienteNeg.salvarCliente(new Cliente());
		System.out.println("executou salvar");
	}

}
