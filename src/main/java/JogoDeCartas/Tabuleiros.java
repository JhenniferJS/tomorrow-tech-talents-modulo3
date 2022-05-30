package JogoDeCartas;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public interface Tabuleiros {

    void inserirDeck(ArrayList<Cartas> cartas);
    boolean inserirCartaAtaque(CartaAtaque carta);
    boolean isVencedor(Jogador @NotNull ... adversarios);
}