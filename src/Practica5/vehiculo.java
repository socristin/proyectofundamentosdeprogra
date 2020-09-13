/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica5;

/**
 *
 * @author cristina soto
 */
public class vehiculo {
 private String placas;
	private String marca;
	private String modelo;
	private int precio;
	
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public vehiculo(String placas, String marca, String modelo, int precio) {
		super();
		this.placas = placas;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public vehiculo(String modelo, int precio) {
		super();
		this.modelo = modelo;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [placas=" + placas + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
}   

