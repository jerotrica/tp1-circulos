package ar.edu.unlam.tp1;

//NOMBRE DE LA CLASE
public class Circulo {

	// DECLARACION ATRIBUTOS
	private Double radio;

	// CONSTRUCTORES
	public Circulo(Double radio) {
		this.radio = radio;
	}

	public Circulo() {

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
		area = (Math.pow(radio, 2) * Math.PI);
		return area;
	}

	
	public boolean equals(Object objeto) {
		Circulo aComparar = (Circulo) objeto;
		if (this.radio.equals(aComparar.getRadio())) {
			return true;
		} else {
			return false;
		}
	}

}
