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
public class microondas {
    private String marca;
	private String modelo;
	private String numserie;
	private String color;
	private float costo;
	
	
	
	public microondas(String marca){
		this.marca = marca;
		this.modelo = "yuw";
		this.numserie = "2567";
		this.color = "negro";
		this.costo = 1200f;
		
	}
	
	public microondas(String marca, String color){
		this.marca = marca;
		this.modelo = "each";
		this.numserie = "276la";
		this.color = color;
		this.costo = 1000f;
	}
	
	public microondas(String marca, String modelo, String numserie, String color, float costo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numserie = numserie;
		this.color = color;
		this.costo = costo;
	}
	public microondas(float costo) {
		this.marca = "doce";
		this.modelo ="doc2012";
		this.numserie = "46546";
		this.color="blanco";
		this.costo = costo;
	}
	public microondas() {
		
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
	public String getNumserie() {
		return numserie;
	}
	public void setNumserie(String numserie) {
		this.numserie = numserie;
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
	@Override
	public String toString() {
		return "Microondas [marca=" + marca + ", modelo=" + modelo + ", numserie=" + numserie + ", color=" + color
				+ ", costo=" + costo + "]";
	}
}
