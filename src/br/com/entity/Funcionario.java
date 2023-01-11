package br.com.entity;

import java.util.Date;
import java.util.Objects;

public class Funcionario {
	private int id_funcionario;
	private String nome;
	private String email;
	private String ativo;
	private Date data_cadastrado;
	private TipoFuncionario tipoFuncionario;
	
	public Funcionario() {}
	
	public Funcionario(int id_funcionario, String nome, String email, String ativo, Date data_cadastrado,TipoFuncionario tipoFuncionario) {
		this.id_funcionario = id_funcionario;
		this.nome = nome;
		this.email = email;
		this.ativo = ativo;
		this.data_cadastrado = data_cadastrado;
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public int getId_funcionario() {
		return id_funcionario;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getAtivo() {
		return ativo;
	}
	public Date getData_cadastrado() {
		return data_cadastrado;
	}
	public TipoFuncionario getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public void setData_cadastrado(Date data_cadastrado) {
		this.data_cadastrado = data_cadastrado;
	}
	public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_funcionario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return id_funcionario == other.id_funcionario;
	}

	@Override
	public String toString() {
		return "Funcionario [id_funcionario=" + id_funcionario + ", nome=" + nome + ", email=" + email + ", ativo="
				+ ativo + ", data_cadastrado=" + data_cadastrado + ", tipoFuncionario=" + tipoFuncionario + "]";
	}
}