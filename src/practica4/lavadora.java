/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author cristina soto
 */
public class lavadora {
    private String marca;
	private String modelo;
	private String color;
	private float costo;
	private int capacidad;
	
	public lavadora(String marca, String color) {
		super();
		this.marca = marca;
		this.modelo = "2015";
		this.color = color;
		this.costo = 3500f;
		this.capacidad =20;
	}
	public lavadora(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.costo = 3800f;
		this.capacidad =15;
		
	}
	public lavadora(String marca, String modelo, String color, float costo, int capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.costo = costo;
		this.capacidad = capacidad;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "Lavadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", costo=" + costo
				+ ", capacidad=" + capacidad + "]";
	}
}
