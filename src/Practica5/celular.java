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
public class celular {
    private String marca;
	private String numero;
	private float precio;
	public celular(String marca, String numero, float precio) {
		super();
		this.marca = marca;
		this.numero = numero;
		this.precio = precio;
	}
	public celular(String numero) {
		super();
		this.numero = numero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", numero=" + numero + ", precio=" + precio + "]";
	}
}

