package Aplicacao;

public class Exec05 {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		//sqrt � igual a raiz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		// pow � igual a valor elevado
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		// abs � igual a valor absoluto
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor Absoluto de " + y + " = " + A);
		System.out.println("Valor Absoluto de " + z + " = " + B);
		
		
		
		
	}

}
