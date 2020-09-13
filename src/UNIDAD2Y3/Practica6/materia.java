/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD2Y3.Practica6;

/**
 *
 * @author cristina soto
 */
public class materia {

    private String clave;
    private String nombre;
    private int calificacion;

    public materia(String clave, String nombre, int calificacion) {
        this.clave = clave;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "materia{" + "clave=" + clave + ", nombre=" + nombre + ", calificacion=" + calificacion + '}';
    }
}
