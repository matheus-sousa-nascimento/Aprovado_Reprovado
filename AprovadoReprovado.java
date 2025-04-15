/*
 * AprovadoReprovado.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		int nota;
		Scanner leia = new Scanner( System.in );
		
		System.out.println("Digite a sua nota: ");
		nota = leia.nextInt();
		
		String res = ( nota >= 0 && nota <= 10 ? nota > 6 ? "APROVADO" : "REPROVADO" : "Invalido");
		
		System.out.println(res);
		
	}
}

