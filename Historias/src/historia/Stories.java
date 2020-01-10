package historia;

import java.util.Arrays;

public class Stories {

	public int[] ordena(int[] codigos) {
		Arrays.sort(codigos);
		
		return codigos;
	}
	
	public String primeiroNome(String nomeCompleto) {
		
		if (nomeCompleto == "") {
			return "Digite um nome!!";
		}
		
		String[] stringSplit = nomeCompleto.split(" ", 2);
		
		
		
		return stringSplit[0];
	}
	
	public String calculadora(int a, String op, int b) {
		int resultado = 0;
		
		if (op == "+") {
			resultado = a + b;
		}
		
		else if (op == "-") {
			resultado = a - b;
		}
		
		else if (op == "*") {
			resultado = a * b;
		}
		
		else if (op == "/") {
			if (b != 0) {
				resultado = a / b;
			}
			
			else {
				return "Erro, não se pode dividir por 0!!";
			}
		}
		
		return Integer.toString(resultado);
	}

}
