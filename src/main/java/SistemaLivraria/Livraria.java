package SistemaLivraria;
import java.util.ArrayList;

public class Livraria {

    ArrayList<Livro> livros;
    ArrayList<Jogo> jogos;
    ArrayList<Filme> filmes;
    ArrayList<AlbumDeMusica> albunsDeMusicas;
    ArrayList<Brinquedo> brinquedos;

    public void adicionar(Item item){
        if(item instanceof Livro){
            livros.add((Livro) item);
        }
        else if(item instanceof Jogo){
            jogos.add((Jogo) item);
        }
        else if(item instanceof Filme){
            filmes.add((Filme) item);
        }
        else if(item instanceof AlbumDeMusica){
            albunsDeMusicas.add((AlbumDeMusica) item);
        }
        else {
            brinquedos.add((Brinquedo) item);
        }
    }
    public void ver(int id){
        System.out.println(livros.stream().filter(livro -> livro.getId() == id));
        System.out.println(jogos.stream().filter(jogo -> jogo.getId() == id));
        System.out.println(filmes.stream().filter(filme -> filme.getId() == id));
        System.out.println(albunsDeMusicas.stream().filter(albumDeMusica -> albumDeMusica.getId() == id));
        System.out.println(brinquedos.stream().filter(brinquedo -> brinquedo.getId() == id));
    }
    public void alterar(int id, Item item){
        if(item instanceof Livro){
            Item livro = livros.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(livro == null){
                System.out.println("Livro nao encontrado");
            } else {
                livros.remove(livro);
                livros.add((Livro) item);
                System.out.println("Livro alterado");
            }
        }
        if(item instanceof Jogo){
            Item jogo = jogos.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(jogo == null){
                System.out.println("Jogo nao encontrado");
            } else {
                jogos.remove(jogo);
                jogos.add((Jogo) item);
                System.out.println("Jogo alterado");
            }
        }
        if(item instanceof Filme){
            Item filme = filmes.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(filme == null){
                System.out.println("Filme nao encontrado");
            } else {
                filmes.remove(filme);
                filmes.add((Filme) item);
                System.out.println("Filme alterado");
            }
        }
        if(item instanceof AlbumDeMusica){
            Item album = albunsDeMusicas.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(album == null){
                System.out.println("Album de musica nao encontrado");
            } else {
                albunsDeMusicas.remove(album);
                albunsDeMusicas.add((AlbumDeMusica) item);
                System.out.println("Album de musica alterado");
            }
        }
        if(item instanceof Brinquedo){
            Item brinquedo = brinquedos.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(brinquedo == null){
                System.out.println("Brinquedo nao encontrado");
            } else {
                brinquedos.remove(brinquedo);
                brinquedos.add((Brinquedo) item);
                System.out.println("Brinquedo alterado");
            }
        }
    }
    public void remover(int id){
        System.out.println(livros.removeIf(x -> x.getId() == id)?"Livro removido":"");
        System.out.println(jogos.removeIf(x -> x.getId() == id)?"Jogo removido":"");
        System.out.println(filmes.removeIf(x -> x.getId() == id)?"Filme removido":"");
        System.out.println(albunsDeMusicas.removeIf(x -> x.getId() == id)?"Album removido":"");
        System.out.println(brinquedos.removeIf(x -> x.getId() == id)?"Brinquedo removido":"");
    }
}
