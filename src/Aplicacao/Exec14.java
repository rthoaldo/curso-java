package Aplicacao;
import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
				
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
		*/
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
				if (tipo == 1) {
					alcool = alcool + 1;
				}
				else if (tipo == 2) {
					gasolina = gasolina + 1;
				}
				else if (tipo == 3) {
					diesel = diesel + 1;
				}
				tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("ALCOOL   : " + alcool);
		System.out.println("GASOLINA : " + gasolina);
		System.out.println("DIESEL   : " + diesel);
		sc.close();
	}

}
