/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

/**
 *
 * @author cristina soto
 */
public class materia {
    private String clave;
	private String nombre;
	private int calificacion;
	
	public materia(String clave, String nombre) {
		super();
		this.clave = clave;
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Materia [clave=" + clave + ", nombre=" + nombre + ", calificacion=" + calificacion + "]";
	}
}
