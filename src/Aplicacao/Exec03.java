package Aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//digitar uma vari�vel sem espa�os;
		//String x;
		//x = sc.next();
		//System.out.println("Voc� digitou: " + x);
		
		//digitar um n�mero inteiro;
		//int x1;
		//x1 = sc.nextInt();
		//System.out.println("Voc� digitou: " + x1);
		
		//digitar um n�mero com ponto flutuante;
		//double x2;
		//x2 = sc.nextDouble();
		//System.out.printf("Voc� digitou: %.2f%n", x2);
		
		//digitar um caracter;
		//char x3;
		//x3 = sc.next().charAt(0);
		//System.out.println("Voc� digitou: " + x3);
		
		//ler v�rio dados na mesma linha;
		String x4;
		int y;
		double z;
		
		x4 = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();		
		System.out.println("Dados digitados");
		System.out.println(x4);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();
	}

}