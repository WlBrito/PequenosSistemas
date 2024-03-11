package entity;
import java.util.HashMap;
import controllers.controlemusicas.ControleDeEstoque;
import java.util.Scanner;

public class Produto {
    private String codigo;
    private String nome;
    private int quantidadeEmEstoque;

    // Construtores, getters e setters
    public Produto(){
        this.codigo = "";
        this.nome = "";
        this.quantidadeEmEstoque = 0;
    }
    public Produto(String codigo, String nome, int qtd){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = qtd;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o código: ");
        this.codigo = leitor.nextLine();
        System.out.println("Informe o nome do produto:");
        this.nome = leitor.nextLine();
        System.out.println("Informe a quantidade em estoque: ");
        this.quantidadeEmEstoque = leitor.nextInt();
        
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}

