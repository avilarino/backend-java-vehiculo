package Vehiculo;

public class Vehiculo {

	private String marca;
	private String modelo;
	private int year;
	private int velocidadMaxima;
	private int velocidadActual;
	
	
	public Vehiculo(String marca, String modelo, int year, int velocidadMaxima, int velocidadActual) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = 0;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	public int acelerar(int velocidad) {
		if(velocidad > velocidadMaxima) {
			velocidad = velocidadMaxima;
		}
		this.velocidadActual = this.velocidadActual + velocidad;
		return velocidadActual;
	}
	
	public int frenar(int freno) {
		if(freno < 0) {
			freno = 0;
		}
		this.velocidadActual = this.velocidadActual - freno;
		return velocidadActual;
	}
	
	
	
}
