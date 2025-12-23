package colecoes.dominio;

import java.util.Objects;

public class Game implements Comparable<Game> {
    private Long id;
    private String nome;
    private double preco;

    public Game(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Double.compare(preco, game.preco) == 0 && Objects.equals(id, game.id) && Objects.equals(nome, game.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Game outroGame) {
//        if (this.id < outroGame.getId()) {
//            return -1;
//        } else if (this.id.equals(outroGame.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

//        return this.id.compareTo(outroGame.getId());
//        return Double.compare(preco, outroGame.getPreco());
        return this.nome.compareTo(outroGame.getNome());
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
