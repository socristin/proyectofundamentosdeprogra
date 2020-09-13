/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author cristina soto
 */
public class principal {
     Scanner leer = new Scanner(System.in);
Calculadora cal = new Calculadora();
public static void main(String[] args) {
	principal p1 = new principal();
	p1.Menu();
	}
	public void Menu() {
		int controlador = 0;
		do {	
		System.out.println("========Calculadora========");
		System.out.println("Selecciona la operacion a realizar");
		System.out.println("1.-Suma.\n2.-Resta.\n3.-División.\n4.-Multiplicación");
		controlador = leer.nextInt();
		System.out.println("========Introduce el 1er numero========");
		float a = leer.nextFloat();
		System.out.println("========Introduce el 2do numero========");
		float b = leer.nextFloat();
		switch (controlador) {
		case 1:
			cal.sumar(a,b);
			break;
		case 2:
			cal.restar(a,b);
			break;
		case 3:
			cal.dividir(a,b);
			break;
		case 4:
			cal.multiplicar(a,b);
			break;
		}
		}while(controlador < 4 || controlador > 1);
	}
}
