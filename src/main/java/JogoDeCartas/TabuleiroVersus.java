package JogoDeCartas;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TabuleiroVersus implements Tabuleiros{
    ArrayList<ArrayList<Cartas>> cartas;
    ArrayList<Cartas> deck1;
    ArrayList<Cartas> deck2;

    int maxAtaque = 10;
    int maxAtaqueEspecial = 4;
    int contAtaque = 0;
    int contAtaqueEspecial = 0;

    public TabuleiroVersus(ArrayList<Cartas> deck1, ArrayList<Cartas> deck2) {
        this.inserirDeck(deck1);
        this.inserirDeck(deck2);
    }

    @Override
    public void inserirDeck(ArrayList<Cartas> deck) {
        cartas.add(deck);
    }

    @Override
    public boolean inserirCartaAtaque(CartaAtaque carta) {
        if(carta instanceof CartaAtaqueEspeciais){
            if(contAtaqueEspecial < maxAtaqueEspecial){
                contAtaqueEspecial++;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(contAtaque < maxAtaque){
                contAtaque++;
                return true;
            }
            else{
                return false;
            }
        }
    }

    @Override
    public boolean isVencedor(Jogador @NotNull ... adversarios) {
        boolean vencedor = true;
        for(int i=0; i<adversarios.length; i++){
            if(adversarios[i].getVida() != 0){
                vencedor = false;
            }
        }
        return vencedor;
    }
}
