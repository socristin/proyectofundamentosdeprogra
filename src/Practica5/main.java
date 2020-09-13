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
public class main {
    public static void main(String[] args) {
		vehiculo car1 = new vehiculo("2MIC", "ford", "ST", 125000);
		vehiculo car2 = new vehiculo("F1TgT",145000);
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		car1.setPrecio(250000);
		System.out.println(car1.toString());
		libro lib1 = new libro("EL PERDEDOR",2012);
		libro lib2 = new libro("MALIK AMSUNG","MI DOBLE VIDA",2000,"NOSTALGIA");
		System.out.println(lib1.getTitulo());
		System.out.println(lib2.getTitulo());
		
		celular cel1 = new celular("samsung","434-187-1441",4800);
		System.out.println(cel1.toString());
		cel1.setNumero("33-33-33-33-33");
		System.out.println(cel1.toString());
	}
}
