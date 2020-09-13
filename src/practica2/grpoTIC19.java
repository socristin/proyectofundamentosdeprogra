/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author cristina soto
 */
public class grpoTIC19 {
 public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		alumno alum1 = new alumno();
		System.out.println("-----------------------Alta alumno 1----------------------------------------------");
		System.out.println("Introduce la matricula");
		alum1.setMatricula(leer.next());
		System.out.println("Introduce el nombre");
		alum1.setNombre(leer.next());
		System.out.println("Introduce el apellido paterno");
		alum1.setApellidoP(leer.next());
		System.out.println("Introduce el apellido materno");
		alum1.setApellidoM(leer.next());
		System.out.println("Introduce la edad");
		alum1.setEdad(leer.nextInt());
		alumno alum2 = new alumno();
		System.out.println("-----------------------Alta alumno 2----------------------------------------------");
		System.out.println("Introduce la matricula");
		alum2.setMatricula(leer.next());
		System.out.println("Introduce el nombre");
		alum2.setNombre(leer.next());
		System.out.println("Introduce el apellido paterno");
		alum2.setApellidoP(leer.next());
		System.out.println("Introduce el apellido materno");
		alum2.setApellidoM(leer.next());
		System.out.println("Introduce la edad");
		alum2.setEdad(leer.nextInt());
		alumno alum3 = new alumno();
		System.out.println("-----------------------Alta alumno 3----------------------------------------------");
		System.out.println("Introduce la matricula");
		alum3.setMatricula(leer.next());
		System.out.println("Introduce el nombre");
		alum3.setNombre(leer.next());
		System.out.println("Introduce el apellido paterno");
		alum3.setApellidoP(leer.next());
		System.out.println("Introduce el apellido materno");
		alum3.setApellidoM(leer.next());
		System.out.println("Introduce la edad");
		alum3.setEdad(leer.nextInt());
		alum1.setNombre("modificado");
		alum2.setEdad(alum2.getEdad()+5);
		System.out.println(alum1.toString());
		System.out.println(alum2.toString());
		System.out.println(alum3.toString());
		leer.close();
	}
}
//Tarea 
//1.- Modificar el nombre del primer alumno
//2.- Aumentar 5 años al segundo alumno
//3.- Imprimir el nombre y apellido de los 3 alumnos   

