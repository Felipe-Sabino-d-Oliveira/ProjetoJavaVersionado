package principal;

import java.util.Scanner;

import funcoes.Questao8;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int num = Questao3.gerarNumeroAleatorio(); System.out.println(num);
		 */
		/*
		 * System.out.println("a: "); double a = sc.nextDouble();
		 * 
		 * System.out.println("b: "); double b = sc.nextDouble();
		 * 
		 * double resultado = Questao4.calcularAreaTriangulo(a, b);
		 * 
		 * System.out.println(resultado);
		 */
		/*
		 * int num = sc.nextInt(); System.out.println(Questao7.classificarNumero(num));;
		 */
		System.out.println("Vai calcular a área de um quadrado ou retângulo?");
		char decisao = sc.next().charAt(0);
		
		if(decisao == 'q') {
			double lado = sc.nextDouble();
			Questao8.calcularArea(lado);
		}
		else if (decisao == 'r') {
			double base = sc.nextDouble();
			double altura = sc.nextDouble();
			Questao8.calcularArea(base, altura);
		}
		
	}
	
}
