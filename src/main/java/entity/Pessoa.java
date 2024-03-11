package entity;

public class Pessoa {

    public static int contador = 0;
    public String nome;
    public int idade;
    public String sexo;
    public double altura;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.sexo = "";
        this.altura = 0.0;
        contador++;
    }

    public Pessoa(String nome, int idade, String sexo, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        contador++;
    }

    public double getAltura() {
        return altura;
    }

    public static int getContador() {
        return contador;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void setContador(int contador) {
        Pessoa.contador = contador;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
