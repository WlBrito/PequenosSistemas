package controllers.controlemusicas;
import entity.Musica;
import java.util.ArrayList;
import java.util.List;

public class ControladorMusicas {
    private List<Musica> musicas;

    public ControladorMusicas() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica reserva) {
        musicas.add(reserva);
        System.out.println("Musica adicionada com sucesso!");
    }

    public void cancelarMusica(String nomeMusica) {
        musicas.remove(nomeMusica);
        System.out.println("Musica cancelada com sucesso!");
    }

    public void listarMusica() {
        for (Musica musica : musicas) {
            System.out.println(musica);
        }
    }

    public Musica buscarMusica(String nomeMusica) {
        for (Musica musica : musicas) {
            if (musica.gettitulo().equals(nomeMusica)) {
                return musica;
            }
        }
        return null;
    }
}