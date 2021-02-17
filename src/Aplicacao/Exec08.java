package Aplicacao;
import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//int x = sc.nextInt();
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//int horaInicial = sc.nextInt();
		//int horaFinal = sc.nextInt();
		//int duracao;
		//int codigo = sc.nextInt();
		//int qtd = sc.nextInt();
		//double numero = sc.nextDouble();
		//double x = sc.nextDouble();
		//double y = sc.nextDouble();
		double salario = sc.nextDouble();
		
		
		/*
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		} 
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		} 
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("são mutiplos");}
		else {
			System.out.println("não são mutiplos");}
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	
		double total;
		if (codigo == 1) {
			total = qtd * 4.0;}
		else if (codigo == 2) {
			total = qtd * 4.5;}
		else if (codigo == 3) {
			total = qtd * 5.0;}
		else if (codigo == 4) {
			total = qtd * 2.0;}
		else {
			total = qtd * 1.5;
			}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo de 0 a 25)");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo de 25 a 50)");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo de 50 a 75)");
		}		
		else {
			System.out.println("Intervalo de 75 a 100)");
		}
				
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		*/
				
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
