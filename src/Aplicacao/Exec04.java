package Aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		//ler um texto até a quebra de linha;
		
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();// desta forma não dá erro na hora de digitar os valores
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// quebra de linhya pendente;
		
		sc.close();

	}

}
