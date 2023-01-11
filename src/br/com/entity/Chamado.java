package br.com.entity;

import java.util.Date;
import java.util.Objects;

public class Chamado {
	private Integer id_chamado;
	private Funcionario funcionario;
	private Cliente cliente;
	private Date data_chamado;
	private String descricao;
	
	public Chamado() {
	}
	
	public Chamado(Integer id_chamado, Funcionario funcionario, Cliente cliente, Date data_chamado, String descricao) {
		this.id_chamado = id_chamado;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.data_chamado = data_chamado;
		this.descricao = descricao;
	}
	public Integer getId_chamado() {
		return id_chamado;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Date getData_chamado() {
		return data_chamado;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setId_chamado(Integer id_chamado) {
		this.id_chamado = id_chamado;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setData_chamado(Date data_chamado) {
		this.data_chamado = data_chamado;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_chamado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		return Objects.equals(id_chamado, other.id_chamado);
	}

	@Override
	public String toString() {
		return "Chamado [id_chamado=" + id_chamado + ", funcionario=" + funcionario + ", cliente=" + cliente
				+ ", data_chamado=" + data_chamado + ", descricao=" + descricao + "]";
	}
}