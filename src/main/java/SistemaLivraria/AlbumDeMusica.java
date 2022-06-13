package SistemaLivraria;
import java.util.ArrayList;

public class AlbumDeMusica extends Item {
    ArrayList<String> generos;
    ArrayList<String> selos;
    ArrayList<String> musicos;

    public AlbumDeMusica(String nome, int id, double preco,
            ArrayList<String> generos, ArrayList<String> selos, ArrayList<String> musicos){
        this.setNome(nome);
        this.setId(id);
        this.setPreco(preco);
        this.generos = generos;
        this.selos = selos;
        this.musicos = musicos;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
                "\nId: " + this.getId() +
                "\nPreco: " + this.getPreco() +
                "\nGeneros: " + this.generos.toString() +
                "\nSelos: " + this.selos.toString() +
                "\nMusica: " + this.musicos.toString();
    }
}
