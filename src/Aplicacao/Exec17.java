package Aplicacao;
import java.util.Scanner;

public class Exec17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		String S1 = original.toLowerCase();
		String S2 = original.toUpperCase();
		String S3 = original.trim();
		String S4 = original.substring(2); //ele monta uma nova string apartir da posição indicada
		String S5 = original.substring(2,9); //ele monta uma nova string apartir da posição indicada
		String S6 = original.replace('a', 'z');
		String S7 = original.replace("abc", "123");
		int S8 = original.indexOf("bc");
		int S9 = original.lastIndexOf("bc");
		
		System.out.println("original          : -" + original + "-");
		System.out.println("toLowerCase       : -" + S1 + "-");
		System.out.println("toUpperCase       : -" + S2 + "-");
		System.out.println("trim              : -" + S3 + "-");
		System.out.println("SubString(2)      : -" + S4 + "-");
		System.out.println("SubString(2 , 9)  : -" + S5 + "-");
		System.out.println("replace(a, z)     : -" + S6 + "-");
		System.out.println("replace(abc, 123) : -" + S7 + "-");
		System.out.println("indexOf(bc)       : -" + S8 + "-");
		System.out.println("lastIndexOf (bc)  : -" + S9 + "-");
		
		sc.close();
	}

}
