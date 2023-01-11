package br.com.entity;

import java.util.Objects;

public class Cliente {
	private int id_cliente;
	private String nome;
	private String cnpj;
	
	public Cliente() {
	}
	
	public Cliente(int id_cliente, String nome, String cnpj) {
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.cnpj = cnpj;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}	
}