/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author cristina soto
 */
public class whalmart {
    public static void main(String[] args) {	
	microondas m1 = new microondas(1000f);
	microondas m2 = new microondas("mabe");
	microondas m3 = new microondas("mabe","negro");
	
	
	
	System.out.println(m1.toString());
	System.out.println(m2.toString());
	System.out.println(m3.toString());
	
	System.out.println("-----Lavadora-----");
	lavadora l1 = new lavadora("Whirpool","rosa");
	lavadora l2 = new lavadora("Mabe","lauc","azul");
	lavadora l3 = new lavadora("doce","5246","Gris",5000,22);
	
	System.out.println(l1.toString());
	System.out.println(l2.toString());
	System.out.println(l3.toString());
	
	Scanner leer = new Scanner(System.in);
	l2.setCosto(leer.nextFloat());
	leer.close();
	}
/*Hacer 3 constructores.  1
 * crear 3 objetos lavadora 
 * mostrar los objetos lavadora 
 * Modificar el costo de la lavadora 2
 */
}

