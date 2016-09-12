package ar.edu.unlam.tp1;

//NOMBRE DE LA CLASE
public class Circulo {

	// DECLARACION ATRIBUTOS
	private Double radio;

	// CONSTRUCTOR
	public Circulo(Double radio) {
		this.radio = radio;

	}

	// GETTERS Y SETTERS
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	// METODOS
	public Double calcularPerimetro() {
		Double perimetro;
		perimetro = (radio * 2 * Math.PI);
		return perimetro;
	}

	public Double calcularArea() {
		Double area;
		area = Math.pow(radio * Math.PI, 2);
		return area;
	}

}


