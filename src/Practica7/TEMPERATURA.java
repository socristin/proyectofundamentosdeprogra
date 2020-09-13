/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica7;

/**
 *
 * @author cristina soto
 */
public class TEMPERATURA {
    double gradosCentigrados;
	public double getGradosCentigrados() {
		return gradosCentigrados;
	}

	public void setGradosCentigrados(double gradosCentigrados) {
		this.gradosCentigrados = gradosCentigrados;
	}
	
	public double convertirAFarenheit(double grados) {
		return (grados*1.8)+32;
	}
	public double convertirAKelvin(double grados) {
		return (grados + 273.15f);
	}
}
