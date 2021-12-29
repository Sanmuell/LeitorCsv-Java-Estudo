package entities;

import java.io.Serializable;

public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private String cod;
	private String unidMedida;
	private String quantidade;
	
	public Produto() {
	}

	public Produto(String descricao, String cod, String unidMedida, String quantidade) {
		super();
		this.descricao = descricao;
		this.cod = cod;
		this.unidMedida = unidMedida;
		this.quantidade = quantidade;
	}


	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getUnidMedida() {
		return unidMedida;
	}

	public void setUnidMedida(String unidMedida) {
		this.unidMedida = unidMedida;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", cod=" + cod + ", unidMedida=" + unidMedida + ", quantidade="
				+ quantidade + "]";
	}
	
	
	

}
