package Aplicacao;
import java.util.Scanner;

public class Exec19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("digite tr�s n�meros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showresult(higher);
		
/*		if (a > b && a > c) {
			System.out.println("o maior n�mero �: " + a);
		}
		else if (b > c) {
			System.out.println("o maior n�mero �: " + b);			
		}
		else {
			System.out.println("o maior n�mero �: " + c);
		}
*/
		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showresult(int value) {
		System.out.println("o maior n�mero �: " + value);
	}
}
