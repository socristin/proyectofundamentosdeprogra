/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica7;

import java.util.Scanner;

/**
 *
 * @author cristina soto
 */
public class CALCULADORA {
 Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		CALCULADORA cal = new CALCULADORA();
		cal.Menu();
	}
	void Menu() {
		int controlador=0;
		double resultado;
		TEMPERATURA temp = new TEMPERATURA();
		do {
		System.out.println("=====Menu Calculadora=====");
		System.out.println("1.-Alta centigrados \n2.-Conversión de °Centigrados a °Farenheit"
				+ "\n3.-Conversión de  °Centigrados a °Kelvin\n4.-Salir");
		controlador = leer.nextInt();
		switch (controlador) {
		case 1:
			System.out.println("Introduce los ° centigrados");
			temp.setGradosCentigrados(leer.nextInt());
			break;
		case 2:
			System.out.println(temp.convertirAFarenheit(temp.getGradosCentigrados()));
			break;
		case 3:
			System.out.println(temp.convertirAKelvin(temp.getGradosCentigrados()));
			break;
		default:
			break;
			}
		 }while(controlador != 4);
	}   
}
