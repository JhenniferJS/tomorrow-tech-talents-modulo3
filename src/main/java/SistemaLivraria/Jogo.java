package SistemaLivraria;
public class Jogo extends Item {

    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String nome, int id, double preco, String distribuidora, String genero, String estudio){
        this.setNome(nome);
        this.setId(id);
        this.setPreco(preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
                "\nId: " + this.getId() +
                "\nPreco: " + this.getPreco() +
                "\nGenero: " + this.genero +
                "\nDistribuidora: " + this.distribuidora +
                "\nEstudio: " + this.estudio;
    }
}
