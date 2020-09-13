/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD2Y3.Practica6;

import java.util.Scanner;

/**
 *
 * @author cristina soto
 */
public class escuela {

    private Scanner leer;

    public escuela() {
        leer = new Scanner(System.in);
    }

    public estudiante altaAlumno() {
        System.out.println(" alta de alumno");
        System.out.println("MATRICULA");
        String matricula = leer.next();
        System.out.println("NOMBRE");
        String nombre = leer.next();
        System.out.println("APELLIDO");
        String apellido = leer.next();
        estudiante estudiante = new estudiante(matricula, nombre, apellido);
        return estudiante;
    }

    public materia altaMateria(int numero) {
        System.out.println(" ALTA DE LA MATERIA " + numero);
        System.out.println("CLAVE");
        String clave = leer.next();
        System.out.println("NOMBRE");
        String nombre = leer.next();
        materia materia = new materia(clave, nombre, -1);
        return materia;
    }
    
    public String calcularPromedio(materia mat1,materia mat2, materia mat3) {

        int promedio;

        if (mat1.getCalificacion() != -1
                && mat2.getCalificacion() != -1
                && mat3.getCalificacion() != -1) {
            promedio = ((mat1.getCalificacion() + mat2.getCalificacion() + mat3.getCalificacion()) / 3);
            return String.valueOf(promedio);
        } else {
            return "Alguna materia no ha sido calificada";
        }

    }

    public void mostrarMenuPrincipal() {
        estudiante est1 = null;
        materia mat1 = null;
        materia mat2 = null;
        materia mat3 = null;
        int opc = 0;
        do {
            System.out.println("...MENU PRINCIPAL...");
            System.out.println(" Alta del alumno");
            System.out.println(" Alta de tres materias ");
            System.out.println(" Asignar calificacion ");
            System.out.println(" Calcular el promedio");
            System.out.println("imprimir");
            System.out.println(" SALIR ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    est1 = this.altaAlumno();
                    break;
                case 2:
                   mat1 = this.altaMateria(1);
                   mat2 = this.altaMateria(2);
                   mat3 = this.altaMateria(3);
                    break;
                case 3:
                    this.submenuMaterias(mat1, mat2, mat3);
                    break;
                case 4:
                    System.out.println(this.calcularPromedio(mat1, mat2, mat3));
                    break;
                case 5:
                    break;
            }
        } while (opc != 6);
    }
    public void submenuMaterias(materia mat1, materia mat2, materia mat3) {
        int opc = 0;
        do {
            System.out.println("::::: MATERIAS ACTUALES :::::");
            System.out.println("1.- " + mat1.getNombre());
            System.out.println("2.- " + mat2.getNombre());
            System.out.println("3.- " + mat3.getNombre());
            System.out.println("4.- Regresar Menu Principal");
            System.out.println("Qué materia desea calificar");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(mat1.getNombre()+ " Calificación ->" + mat1.getCalificacion());
                    System.out.println("Ingresar nueva Calificación");
                    mat1.setCalificacion(leer.nextInt());
                    break;
                case 2:
                    System.out.println(mat2.getNombre()+ " Calificación ->" + mat2.getCalificacion());
                    System.out.println("Ingresar nueva Calificación");
                    mat2.setCalificacion(leer.nextInt());
                    break;
                case 3:
                    System.out.println(mat3.getNombre()+ " Calificación ->" + mat3.getCalificacion());
                    System.out.println("Ingresar nueva Calificación");
                    mat3.setCalificacion(leer.nextInt());
                    break;
            }
        } while (opc != 4);
    }
        public static void main(String[] args) {
        escuela itspa = new escuela();
        itspa.mostrarMenuPrincipal();

    }


}

