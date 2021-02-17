package Aplicacao;
import java.util.Scanner;

public class Exec10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terca-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
		/*
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		if (x == 1) {
		dia = "domingo";
		}
		else if (x == 2) {
		dia = "segunda";
		}
		else if (x == 3) {
		dia = "terca";
		}
		else if (x == 4) {
		dia = "quarta";
		}
		else if (x == 5) {
		dia = "quinta";
		}
		else if (x == 6) {
		dia = "sexta";
		}
		else if (x == 7) {
		dia = "sabado";
		}
		else {
		dia = "valor invalido";
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
		*/
	}
}