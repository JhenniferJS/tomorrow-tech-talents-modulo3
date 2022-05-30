package JogoDeCartas;

public class CartaAtaque implements Cartas{

    private String nome;
    private String tipo;
    private int custo;
    private int poder;
    private int resistencia;

    public CartaAtaque(String nome, String tipo, int custo, int poder, int resistencia) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.poder = poder;
        this.resistencia = resistencia;
    }

    public int verPoder() {
        return this.poder;
    }

    public int verResistencia() {
        return this.resistencia;
    }

    @Override
    public String verNome() {
        return this.nome;
    }

    @Override
    public String verTipo() {
        return this.tipo;
    }

    @Override
    public int verCusto() {
        return this.custo;
    }
}
