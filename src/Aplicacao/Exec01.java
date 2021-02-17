package Aplicacao;

import java.util.Locale;

public class Exec01 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//System.out.printf("Resultado = %.2f Metros%n", x);
		System.out.printf("%s which price is $ %.2f %n", product1, price1 );
		System.out.printf("%s which price is $ %.2f %n", product2, price2 );
		System.out.println("Record: " + age + " years old, " + " Code: " + code + " and Gender: " + gender);
		System.out.printf("Measure with eight decimal place: %f %n", measure);
		System.out.printf("Rouded (three decimal place): %.3f %n", measure);
		Locale.setDefault(Locale.US);//seta a localização para tirar a virgula e deixar padrão americano
		System.out.printf("US decimal place: %f %n", measure);
	}

}