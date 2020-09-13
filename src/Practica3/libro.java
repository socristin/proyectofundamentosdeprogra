/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

/**
 *
 * @author cristina soto
 */
public class libro {
    private int isbn;
	private String titulo;
	private String Autor;
	private int paginas;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
        @Override
	public String toString() {
		return "El libro con ISBN " + isbn + " con titulo: " + titulo + " del autor " 
				+ Autor + " con " + paginas + " paginas"+"]";
	}
}
