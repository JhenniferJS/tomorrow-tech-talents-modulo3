package JogoDeCartas;

public class CartaAtaqueEspeciais extends CartaAtaque{

    private String efeito;

    public CartaAtaqueEspeciais(String nome, String tipo, int custo, int poder, int resistencia, String efeito) {
        super(nome, tipo, custo, poder, resistencia);
        this.efeito = efeito;
    }

    public String verEfeito(){
        return this.efeito;
    }
}
