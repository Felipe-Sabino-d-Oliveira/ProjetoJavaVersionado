package funcoes;

public class Questao7 {
	
	public static String classificarNumero(int num) {
		
		String resultado = num == 0 ? "Nulo" : num < 0 ? "Negativo" : "Positivo";
		
		return resultado;
	}
}
