package Aplicacao;
import java.util.Scanner;

public class Exec12 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		double price = 400.00;
		double discount;
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = price * 0.05;
		}
		System.out.println(discount);
		sc.close();
	}

}
