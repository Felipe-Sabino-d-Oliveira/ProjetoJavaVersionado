package principal;

import funcoes.Questao3;

public class Main {

	public static void main(String[] args) {
		
		int num = Questao3.gerarNumeroAleatorio();
		
		System.out.println(num);
		
		saudar();		
	}
	
	public static void saudar() {
		System.out.println("Oi");
	}
}
