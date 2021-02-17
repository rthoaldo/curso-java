package Aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class Exec06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//exerc�cio 01
		/*
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroquadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroquadrado;
		
		
		System.out.printf("�rea  : %.2f%n",  area);
		System.out.printf("Pre�o : %.2f%n", preco);
		
		//digitar um n�mero com ponto flutuante;

		
		//double a1 = 10.00;
		//double b1 = 30.00;
				
		//System.out.printf("Soma  = %.2f%n", a1 + b1);
		
		//double a2 = -30.00;
		//double b2 = 10.00;
				
		//System.out.printf("Soma  = %.2f%n", a2 + b2);
		
		//double a3 = 0.00;
		//double b3 = 0.00;
				
		//System.out.printf("Soma  = %.2f%n", a3 + b3);
		
		//exerc�cio 02
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A = %.4f%n", A);
		
		//exerc�cio 03
		
		int A, B, C, D, dif;

	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFEREN�A = " + dif);	
		
		
		// exerciocio 04
		
	    int funcionario = sc.nextInt();
		double horaTrabalhada = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double valorHoraRecebe = valorHora * horaTrabalhada;
		
		System.out.println("Funcion�rio: " + funcionario);
		System.out.printf("Sal�rio R$ %.2f%n", valorHoraRecebe);
		
		//========>exercicio resolvido
		int numero, horas;
	    double valorHora, salario;
		
		
	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		*/
		//exerc�cio 06
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		/*
		a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		b) a �rea do c�rculo de raio C. (pi = 3.14159)
		c) a �rea do trap�zio que tem A e B por bases e C por altura.
		d) a �rea do quadrado que tem lado B.
		e) a �rea do ret�ngulo que tem lados A e B.
		*/
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);		
		
		sc.close();
		
	}

}
