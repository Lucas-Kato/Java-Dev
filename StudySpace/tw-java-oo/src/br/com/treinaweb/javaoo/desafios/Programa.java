package br.com.treinaweb.javaoo.desafios;

public class Programa {

	public static void main(String[] args) {
		
		PrimeiraClasse pc = new PrimeiraClasse();
		
		pc.setCurso("Java - Orientação a objetos");
		pc.setDescricao("Desafio do curso de Java Orientação à objetos");
		pc.ola();
		
		System.out.println(pc.getCurso());
		System.out.println(pc.getDescricao());
		
	}
}
