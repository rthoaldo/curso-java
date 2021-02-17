package Aplicacao;
import java.util.Scanner;

public class Exec16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		char resp = 's';
		while (resp != 'n') {
			System.out.print("digite a temperatura em celcius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("equivalente em fahrenheit: %.1f%n", F);
			System.out.print("deseja repetir S/N");
			resp = sc.next().charAt(0);
		}
		*/
		char resp;
		do {
			System.out.print("digite a temperatura em celcius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("equivalente em fahrenheit: %.1f%n", F);
			System.out.print("deseja repetir S/N ");
			resp = sc.next().charAt(0);
		}	while (resp != 'n')	;
			
		System.out.println("fim de processamento");
		sc.close();
	}

}
