package JogoDeCartas;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TabuleiroParty implements Tabuleiros {
    private ArrayList<ArrayList<Cartas>> cartas;
    private ArrayList<Cartas> deck1;
    private ArrayList<Cartas> deck2;
    private ArrayList<Cartas> deck3;
    private ArrayList<Cartas> deck4;
    private ArrayList<Cartas> deck5;
    private int maxAtaque = 34;
    private static int cont = 0;

    public TabuleiroParty(ArrayList<Cartas> deck1, ArrayList<Cartas> deck2, ArrayList<Cartas> deck3, ArrayList<Cartas> deck4, ArrayList<Cartas> deck5) {
        this.inserirDeck(deck1);
        this.inserirDeck(deck2);
        this.inserirDeck(deck3);
        this.inserirDeck(deck4);
        this.inserirDeck(deck5);
    }

    @Override
    public void inserirDeck(ArrayList<Cartas> deck) {
        cartas.add(deck);
    }

    @Override
    public boolean inserirCartaAtaque(CartaAtaque carta) {
        if(cont < maxAtaque){
            cont++;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isVencedor(Jogador @NotNull ... adversarios) {
        boolean vencedor = true;
        for (int i = 0; i < adversarios.length; i++) {
            if (adversarios[i].getVida() != 0) {
                vencedor = false;
            }
        }
        return vencedor;
    }
}
