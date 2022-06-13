package SistemaLivraria;
public class Brinquedo extends Item{
    private String tipo;

    public Brinquedo(String nome, int id, double preco, String tipo){
        this.setNome(nome);
        this.setId(id);
        this.setPreco(preco);
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
                "\nId: " + this.getId() +
                "\nPreco: " + this.getPreco() +
                "\nTipo: " + this.tipo;
    }
}
