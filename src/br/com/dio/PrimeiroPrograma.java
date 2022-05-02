package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
//		for(int i=1; i<=10; i++) {
//			System.out.println("Hello World " + i);
//		}
	}

}

class Livros {
	private String nome;
	private String npag;
}
