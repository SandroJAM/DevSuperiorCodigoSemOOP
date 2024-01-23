package dssemoop;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaSemOop {

	public static void main(String[] args) {
		// Sem orientação a objetos
		
		Locale.setDefault(Locale.US); // Padronizar decimal com ponto ao invés de vírgula
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		double valorPorHora1, valorPorHora2, valorTotal;
		int horas1, horas2;
		
		System.out.println("Dados do primeiro funcionário: ");
		nome1 = sc.next();
		valorPorHora1 = sc.nextDouble();
		horas1 = sc.nextInt();
		
		System.out.println("Dados do segundo funcionário: ");
		nome2 = sc.next();
		valorPorHora2 = sc.nextDouble();
		horas2 = sc.nextInt();
		
		// valorTotal = (valorPorHora1 * horas1) + (valorPorHora2 * horas2); Expressão Aritmética - Parenteses opcional
		valorTotal = valorPorHora1 * horas1 + valorPorHora2 * horas2;
		
		System.out.printf("Valor Total: = %.2f%n ", valorTotal);
		
	}

}
