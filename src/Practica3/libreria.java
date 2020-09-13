/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

import java.util.Scanner;

/**
 *
 * @author cristina soto
 */
public class libreria {
 public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		libro lib1 = new libro();
		libro lib2 = new libro();
		System.out.println("Libro 1");
		System.out.println("ISBN");
		lib1.setIsbn(leer.nextInt());
		System.out.println("Titulo");
		lib1.setTitulo(leer.next());
		System.out.println("Autor");
		lib1.setAutor(leer.next());
		System.out.println("Paginas numericos");
		lib1.setPaginas(leer.nextInt());
		
		System.out.println("Libro 2");
		System.out.println("ISBN");
		lib2.setIsbn(leer.nextInt());
		System.out.println("Titulo");
		lib2.setTitulo(leer.next());
		System.out.println("Autor");
		lib2.setAutor(leer.next());
		System.out.println("Paginas numericos");
		lib2.setPaginas(leer.nextInt());
		
		System.out.println("La libreria tiene");
		System.out.println(lib1.toString());
		System.out.println(lib2.toString());
		if (lib1.getPaginas() > lib2.getPaginas()){
			System.out.println("El libro " + lib1.getTitulo()+ " tiene mas paginas que "+ lib2.getTitulo());
		}else {
			if (lib1.getPaginas() == lib2.getPaginas()) {
				System.out.println("Los dos tienen el mismo numero de paginas");
			} else {
				System.out.println("El libro " + lib2.getTitulo() + " tiene mas paginas que " + lib1.getTitulo());
			}
		}
		leer.close();
	}   
}
