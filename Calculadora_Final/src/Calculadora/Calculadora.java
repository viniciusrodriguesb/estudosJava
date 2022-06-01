package Calculadora;

public class Calculadora {
	private double valor1;
	private double valor2;

	public Calculadora() {
	}

	public Calculadora(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double somar() {
		return valor1 + valor2;
	}

	public double somar(double a, double b) {

		return a + b;
	}

	public double subtrair() {
		return valor1 - valor2;
	}

	public double subtrair(double a, double b) {

		return a - b;
	}

	public double multiplicar() {
		return valor1 * valor2;
	}

	public double multiplicar(double a, double b) {

		return a * b;
	}

	public double dividir() {
		double retorno;
		if (valor2 == 0) {
			retorno = valor2;
		} else {
			return valor1 / valor2;
		}
		return retorno;
	}

	public double dividir(double a, double b) {
		double retorno;

		if (b == 0) {
			retorno = b;
		} else {

			retorno = a / b;
		}

		return retorno;
	}
}
