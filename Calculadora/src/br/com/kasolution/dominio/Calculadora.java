package br.com.kasolution.dominio;

public class Calculadora {
	//atributo
	
	
	//soma(7.5, 8.0)
	public static double soma(double v1, double v2) {
		return v1 + v2;
	}
	
	//soma(7.5f, 8.0f)
	static public float soma(float v1, float v2) {
		return v1 + v2;
	}

	//soma(100, 200, 300)
	static public long soma(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
	
	//soma(100L, 200L, 300L)
	static public long soma(long v1, long v2, long v3) {
		System.out.print("OPC(A) ");
		return v1 + v2 + v3;
	}

	//soma(100, 200, 300, 400, 500, 600)
	static public long soma(long...valores) { //soma(1, 2, 3), soma(1, 2), soma(1, 2, 3, 4, 5)
		System.out.print("OPC(B) ");
		long soma = 0;
		for (long v : valores) {
			soma += v;
		}
		return soma;
	}
	
	//soma(100.0, 200.0, 300.0, 400.0, 500.0, 600.0)
	static public double soma(double...valores) {
		long soma = 0;
		for (double v : valores) {
			soma += v;
		}
		return soma;
	}
}
