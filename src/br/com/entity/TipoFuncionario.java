package br.com.entity;

import java.util.Objects;

public class TipoFuncionario {
	private int id_tipoFuncionario;
	private String descricao;
	
	public TipoFuncionario() {
	}

	public TipoFuncionario(int id_tipoFuncionario, String descricao) {
		this.id_tipoFuncionario = id_tipoFuncionario;
		this.descricao = descricao;
	}

	public int getId_tipoFuncionario() {
		return id_tipoFuncionario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setId_tipoFuncionario(int id_tipoFuncionario) {
		this.id_tipoFuncionario = id_tipoFuncionario;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_tipoFuncionario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoFuncionario other = (TipoFuncionario) obj;
		return id_tipoFuncionario == other.id_tipoFuncionario;
	}

	@Override
	public String toString() {
		return "TipoFuncionario [id_tipoFuncionario=" + id_tipoFuncionario + ", descricao=" + descricao + "]";
	}
}