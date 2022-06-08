package geometria;

public class Quadrado implements FiguraGeometrica {

	int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String nomeFigura() {

		return "Quadrado";
	}

	@Override
	public int Area() {
		int area = 0;
		area = lado * lado;

		return area;
	}
	
	@Override
	public int Perimetro() {
		int perimetro = 0;

		perimetro = lado * 4;

		return perimetro;
	}
}