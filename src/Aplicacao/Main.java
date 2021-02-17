package Aplicacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.45678;
		String nome = "Rafael";
		int idade = 44;
		double renda = 100.0;
		
		System.out.println("Olá Mundo!!!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);//seta a localização para tirar a virgula e deixar padrão americano
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f Metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
