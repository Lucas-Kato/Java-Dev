package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;

public class Veiculo {

	private String nome;
	private String marca;
	private String chassi;
	private Integer quantidadeRodas;
	private float quantidadeCombustivel;

	public void ligar() {

		System.out.println("o veículo ligou!");
	}

	public void desligar() {

		System.out.println("o veículo desligou!");
	}

	public void abastecer(float litros) {

		quantidadeCombustivel += litros;

	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws Exception {
		
		if (chassi.length() == 5) {
			
			this.chassi = chassi;
			
		} else {
			
			throw new ChassiInvalidoException("Chassi informando é inválido");
			
		}
	}

	public Integer getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(Integer quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}

}
