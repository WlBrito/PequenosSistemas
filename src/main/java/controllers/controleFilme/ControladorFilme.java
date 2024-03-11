/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.controleFilme;

import entity.Filme;
import entity.Musica;
import java.util.ArrayList;
import java.util.List;

public class ControladorFilme {
    private List<Filme> listaDeFilmes;

    public ControladorFilme() {
        this.listaDeFilmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        listaDeFilmes.add(filme);
        System.out.println("Filme adicionada com sucesso!");
    }

    public void cancelarFilme(String nomeFilme) {
        listaDeFilmes.remove(nomeFilme);
        System.out.println("Filme cancelado com sucesso!");
    }

    public void listarFilmes() {
        for (Filme filme : listaDeFilmes) {
            System.out.println(filme);
        }
    }

    public Filme buscarFilmes(String nomeFilme) {
        for (Filme filme : listaDeFilmes) {
            if (filme.gettitulo().equals(nomeFilme)) {
                return filme;
            }
        }
        return null;
    }
}
