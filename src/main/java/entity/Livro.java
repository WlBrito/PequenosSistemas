/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Scanner;

public class Livro {
 
    private String titulo;
    private String autor;
    private int num_pag;
    private double preco;
    private static String NomeBiblioteca;

    public Livro() {
        titulo = "";
        autor = "";      
        preco = 0.0;
        NomeBiblioteca = "BIBLIOTECA ABACAXI";
    }

    public Livro(String titulo, String autor, int num_pag, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        NomeBiblioteca = "BIBLIOTECA ABACAXI";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getAutor() {
        return autor;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static String getNomeBiblioteca() {
        return NomeBiblioteca;
    }

    public static void setNomeBiblioteca(String NomeBiblioteca) {
        Livro.NomeBiblioteca = NomeBiblioteca;
    }
    
    

    @Override
    public String toString() {
        return "Livro\n" +
                "Titulo=" + titulo + "\n" +
                ", Autor=" + autor + "\n" +
                ", preco=" + preco +
                "\n" + "Biblioteca =" + NomeBiblioteca + "\n";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o titulo: ");
        this.setTitulo(leitor.next());
        System.out.println("Insira o autor: ");
        this.setAutor(leitor.next());
        System.out.println("Insira o preco: ");
        this.setPreco(leitor.nextDouble());
        
    }
    
    
}
