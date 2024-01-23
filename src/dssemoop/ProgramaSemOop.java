package dssemoop;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaSemOop {

	public static void main(String[] args) {
		// Sem orienta��o a objetos
		
		Locale.setDefault(Locale.US); // Padronizar decimal com ponto ao inv�s de v�rgula
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		double valorPorHora1, valorPorHora2, valorTotal;
		int horas1, horas2;
		
		System.out.println("Dados do primeiro funcion�rio: ");
		nome1 = sc.next();
		valorPorHora1 = sc.nextDouble();
		horas1 = sc.nextInt();
		
		System.out.println("Dados do segundo funcion�rio: ");
		nome2 = sc.next();
		valorPorHora2 = sc.nextDouble();
		horas2 = sc.nextInt();
		
		// valorTotal = (valorPorHora1 * horas1) + (valorPorHora2 * horas2); Express�o Aritm�tica - Parenteses opcional
		valorTotal = valorPorHora1 * horas1 + valorPorHora2 * horas2;
		
		System.out.printf("Valor Total: = %.2f%n ", valorTotal);
		
	}

}
