package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		try {

			Veiculo veiculo = new Veiculo();

			veiculo.setNome("Supra MK4");
			veiculo.setMarca("Toyota");
			veiculo.setChassi("6666");
			veiculo.setQuantidadeRodas(4);
			veiculo.abastecer(20);

			veiculo.ligar();
			System.out.println(veiculo.getQuantidadeCombustivel());

		} catch (Exception e) {

			System.out.println("Ocorreu um erro: " + e.getMessage());
		}

	}

}
