package Aplicacao;

public class Exec02 {

	public static void main(String[] args) {
			
			int x, y;
			
			x = 5;
			y = 2*x;
			
			System.out.println(x);
			System.out.println(y);
			
			int x1;
			double y1;
			
			x1 = 5;
			y1 = 2 * x1;
			
			System.out.println(x1);
			System.out.println(y1);
			
			double b, B, h, area;
			
			b = 6.0;
			B = 8.0;
			h = 5.0;
			
			area = (b+B) / 2.0 * h;
			System.out.println(area);
			
			int a1, b1, a2, b2;
			double resultado1, resultado2;
			
			a1 = 5;
			b1 = 2;
			
			resultado1 = a1 / b1; 
			System.out.println(resultado1);
			
			a2 = 5;
			b2 = 2;
			
			resultado2 = (double) a2 / b2; 
			//com a expressao "DOUBLE" ele considera as casas decimeais.
			System.out.println(resultado2);
			
			double a3;
			int b3;
			
			a3 = 5.0;
			//por ser uma variável com ponto flutuante desta forma tem um erro.
			//b3 = a3;
			//colocando "INT" ele assume que é valor inteiro.
			b3 = (int) a3;
			System.out.println(b3);
			
	}

}
