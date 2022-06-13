package SistemaLivraria;
public class Livro extends Item {

    private String genero;
    private String escritor;
    private String editora;

    public Livro(String nome, int id, double preco, String genero, String escritor, String editora){
        this.setNome(nome);
        this.setId(id);
        this.setPreco(preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
                "\nId: " + this.getId() +
                "\nPreco: " + this.getPreco() +
                "\nGenero: " + this.genero +
                "\nEscritor: " + this.escritor +
                "\nEditora: " + this.editora;
    }
}
