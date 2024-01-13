package br.com.treinaweb.javaoo.desafios;

public class Curso {

	private String descricao;
	private String nome;
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) throws Exception {
		if (valor > 0) {

			this.valor = valor;

		} else {

			throw new Exception();
		}

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
