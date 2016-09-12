package ar.edu.unlam.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circuloPrueba = new Circulo(2d);
		Double radio;
		radio= circuloPrueba.getRadio();
		assertEquals(2, radio ,0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circuloPrueba = new Circulo();
		circuloPrueba.setRadio(3.7);
		assertEquals(3.7, circuloPrueba.getRadio() ,0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circuloPrueba = new Circulo(5.0);
		Double radio;
		radio= circuloPrueba.getRadio();
		assertEquals(5, radio ,0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circuloPrueba = new Circulo(10.9);
		Double radio;
		radio= circuloPrueba.getRadio();
		assertEquals(10.9, radio ,0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61punto57() {
		Circulo circuloPrueba = new Circulo(9.8);
		Double perimetro;
		perimetro = circuloPrueba.calcularPerimetro();
		assertEquals(61.57, perimetro, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto69() { 
		Circulo circuloPrueba = new Circulo(16.6);
		Double area;
		area = circuloPrueba.calcularArea();
		assertEquals(865.69, area, 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
