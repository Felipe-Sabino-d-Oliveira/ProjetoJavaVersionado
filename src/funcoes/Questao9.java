package funcoes;

public class Questao9 {
	
	public static int encontrarMaiorNumero (int[] conjuntoNumeros) {
		int maior = 0;
		
		for (int num : conjuntoNumeros) {
			if(num > maior) {
				maior = num;
			}
		}
		
		return maior;
	}
}
