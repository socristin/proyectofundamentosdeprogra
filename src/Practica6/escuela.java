/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;
import java.util.Scanner;
/**
 *
 * @author cristina soto
 */
public class escuela {
    Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		escuela esc = new escuela();
		esc.Menu();
	}
	private void Menu() {
		estudiante est = null;
		materia mat1 = null;
		materia mat2 = null;
		materia mat3 = null;
		int controlador;
		int promedio = 0;
		do {
		System.out.println("=====Control escolar=====");
		System.out.println("1.-Registrar alumno.\n2.-Registrar materia"
				+ "\n3.-Asignar calificaciones\n4.-Calcular promedio\n5.-Imprimir\n6.-Salir");
		controlador = leer.nextInt();
		switch (controlador){
		case 1:
			est = this.RegistrarAlumno();
			break;
		case 2:
			mat1 = this.RegistrarMateria(1);
			mat2 = this.RegistrarMateria(2);
			mat3 = this.RegistrarMateria(3);
			break;
		case 3:
			if (mat1 != null && mat2 != null && mat3!=null) {
				this.MenuMateria(mat1, mat2, mat3);
			}else {
				System.err.println("Las materias no han sido asignadas");
			}
			break;
		case 4:
			if (mat1 != null && mat2 != null && mat3!=null) {
			promedio = this.Promedio(mat1, mat2, mat3, 3);
			System.out.println("El promedio es de " + promedio);
			}else {
				System.err.println("Las materias no han sido asignadas");
			}
			break;
		case 5:
			if (est != null) {
				if (mat1 != null && mat2 != null && mat3!=null) {
					this.Imprimir(est, mat1, mat2, mat3);
				}else {
					System.err.println("Las materias no han sido asignadas");
				}
			}else {
				System.err.println("El estudiante aun no ha sido registrado");
			}
			break;
		case 6:
			
			break;
		}
		}while(controlador != 6);
		
	}
	private estudiante RegistrarAlumno() {
		String a,b,c;
		System.out.println("=====Registra el alumno=====");
		System.out.print("Matricula: ");
		a= leer.next();
		System.out.print("Nombre: ");
		b = leer.next();
		System.out.print("Apellido: ");
		c = leer.next();
		estudiante est = new estudiante(a,b,c);
		return est;
	}
	private materia RegistrarMateria(int numero) {
		String a,b;
		System.out.println("=====Registra Materia "+ numero +"=====");
		System.out.print("clave: ");
		a= leer.next();
		System.out.print("Nombre: ");
		b = leer.next();
		materia mat = new materia(a,b);
		return mat;
	}
	private void MenuMateria(materia mat1, materia mat2, materia mat3) {
		int controlador;
		do {
		System.out.println("=====Materias=====");
		System.out.println("1.-" + mat1.getNombre()+ " Calificación -> " + mat1.getCalificacion());
		System.out.println("2.-" + mat2.getNombre()+ " Calificación -> " + mat2.getCalificacion());
		System.out.println("3.-" + mat3.getNombre()+ " Calificación -> " + mat3.getCalificacion());
		System.out.println("4.- Salir.\nSelecciona la materia para asignar calificaciones");
		controlador = leer.nextInt();
		switch (controlador) {
		case 1:
			System.out.println("=====Introduce la calificacion nueva para "+ mat1.getNombre() + "=====");
			mat1.setCalificacion(leer.nextInt());
			break;
		case 2:
			System.out.println("=====Introduce la calificacion nueva para "+ mat2.getNombre() + "=====");
			mat2.setCalificacion(leer.nextInt());
			break;
		case 3:
			System.out.println("=====Introduce la calificacion nueva para "+ mat3.getNombre() + "=====");
			mat3.setCalificacion(leer.nextInt());
			break;
		}
		}while(controlador !=4);	
	}
	private int Promedio(materia m1, materia m2,materia m3, int numeros) {
		int promedio = 0;
			promedio = ((m1.getCalificacion()+m2.getCalificacion()+m3.getCalificacion())/numeros);
		return promedio;
		
	}
	private void Imprimir(estudiante est, materia mat1, materia mat2, materia mat3){
			boolean m1,m2,m3;
			m1=(mat1.getCalificacion()>0)?true:false;
			m2=(mat2.getCalificacion()>0)?true:false;
			m3=(mat3.getCalificacion()>0)?true:false;
			if (m1 && m2 && m3) {
				System.out.println(est.toString() + " tiene un promedio de " + this.Promedio(mat1, mat2, mat3, 3)
				+ " compuesto por las siguiente materias:");
				System.out.println("1.-" + mat1.getNombre()+ " Calificación -> " + mat1.getCalificacion());
				System.out.println("2.-" + mat2.getNombre()+ " Calificación -> " + mat2.getCalificacion());
				System.out.println("3.-" + mat3.getNombre()+ " Calificación -> " + mat3.getCalificacion());
			}else if (m1&&m2) {
				System.out.println(est.toString() + " tiene un promedio de " + this.Promedio(mat1, mat2, mat3, 2)
				+ " compuesto por las siguiente materias:");
				System.out.println("1.-" + mat1.getNombre()+ " Calificación -> " + mat1.getCalificacion());
				System.out.println("2.-" + mat2.getNombre()+ " Calificación -> " + mat2.getCalificacion());
				System.out.println("Materias por calificar:");
				System.out.println(mat3.getNombre());
				
			}else if (m1&&m3) {
				System.out.println(est.toString() + " tiene un promedio de " + this.Promedio(mat1, mat2, mat3, 2)
				+ " compuesto por las siguiente materias:");
				System.out.println("1.-" + mat1.getNombre()+ " Calificación -> " + mat1.getCalificacion());
				System.out.println("2.-" + mat3.getNombre()+ " Calificación -> " + mat3.getCalificacion());
				System.out.println("Materias por calificar:");
				System.out.println(mat2.getNombre());
			}else if (m2&&m3) {
				System.out.println(est.toString() + " tiene un promedio de " + this.Promedio(mat1, mat2, mat3, 2)
				+ " compuesto por las siguiente materias:");
				System.out.println("1.-" + mat2.getNombre()+ " Calificación -> " + mat2.getCalificacion());
				System.out.println("2.-" + mat3.getNombre()+ " Calificación -> " + mat3.getCalificacion());
				System.out.println("Materias por calificar:");
				System.out.println(mat1.getNombre());
				
			}else if (m1&&!m2&&!m3) {
				System.out.println(est.toString() + " tiene un promedio de " + mat1.getCalificacion() + "\nya que solo la materia de "
						+ mat1.getNombre() + " ha sido calificada");
				System.out.println("Materias por calificar:\n"+ mat2.getNombre()+"\n" + mat3.getNombre());
			}else if (m2&&!m3&&!m1) {
				System.out.println(est.toString() + " tiene un promedio de " + mat2.getCalificacion() + "\nya que solo la materia de "
						+ mat2.getNombre() + " ha sido calificada");
				System.out.println("Materias por calificar:\n"+ mat1.getNombre()+"\n" + mat2.getNombre());
				
			}else if (m3&&!m2&&!m1) {
				System.out.println(est.toString() + " tiene un promedio de " + mat3.getCalificacion() + "\nya que solo la materia de "
						+ mat3.getNombre() + " ha sido calificada");
				System.out.println("Materias por calificar:\n"+ mat1.getNombre()+"\n" + mat2.getNombre());
			}else {
				System.out.println(est.toString() + " tiene un promedio de 0, ya que ninguna materia a sido calificada");
			}
	}
}
