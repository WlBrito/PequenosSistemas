/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.Scanner;

public class Filme {
 
    private String titulo;
    private String artista;
    private int duracao;
    private double preco;

    public Filme() {
        titulo = "";
        artista = "";
        duracao = 0;
        preco = 0.0;
    }

    public Filme(String titulo, String artista, int duracao, double preco) {
        this.titulo = titulo;
        this.artista =artista;
        this.duracao = duracao;
        this.preco = preco;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getartista() {
        return artista;
    }

    public int getduracao() {
        return duracao;
    }

    public double getpreco() {
        return preco;
    }

    public String gettitulo() {
        return titulo;
    }

    public void setartista(String artista) {
        this.artista =artista;
    }

    public void setduracao(int duracao) {
        this.duracao = duracao;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o titulo: ");
        this.settitulo(leitor.next());
        System.out.println("Insira a artista: ");
        this.setartista(leitor.next());
        System.out.println("Insira a duracao:");
        this.setduracao(leitor.nextInt());
        System.out.println("Insira o preco: ");
        this.setpreco(leitor.nextDouble());
        
    }
    
    
}
