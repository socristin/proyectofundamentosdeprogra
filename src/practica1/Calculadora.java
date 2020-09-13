/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;


/**
 *
 * @author cristina soto
 */
public class Calculadora {
 private float resultado;
	
	public float sumar(float a, float b){
		resultado =a+b;
		System.out.println(a+" + "+b+" es igual a = "+ resultado + "\n\n");
		return resultado;
	}
	public float restar(float a, float b){
		resultado =a-b;
		System.out.println(a+" - "+b+" es igual a = "+ resultado + "\n\n");
		return resultado;
	}
	public float multiplicar(float a, float b){
		resultado =a*b;
		System.out.println(a+" * "+b+" es igual a = "+ resultado + "\n\n");
		return resultado;
	}
	public float dividir(float a, float b){
		resultado =a/b;
		System.out.println(a+" / "+b+" es igual a = "+ resultado + "\n\n");
		return resultado;
	}
}
