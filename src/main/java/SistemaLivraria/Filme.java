package SistemaLivraria;

import java.util.ArrayList;

public class Filme extends Item {

    private String estudio;
    ArrayList<String> generos;
    ArrayList<String> diretores;
    ArrayList<String> produtores;

    public Filme (String nome, int id, double preco, String estudio,
            ArrayList<String> diretores, ArrayList<String> produtores){
        this.setNome(nome);
        this.setId(id);
        this.setPreco(preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.produtores = produtores;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
                "\nId: " + this.getId() +
                "\nPreco: " + this.getPreco() +
                "\nEstudio: " + this.estudio +
                "\nDiretores: " + this.diretores +
                "\nProdutores: " + this.produtores;
    }

}
