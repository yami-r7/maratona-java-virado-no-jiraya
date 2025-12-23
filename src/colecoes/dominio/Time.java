package colecoes.dominio;

import java.util.Objects;

public class Time {
    private Long id;
    private String nome;
    private double valor;

    public Time(Long id, String nome, double valor) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return Double.compare(valor, time.valor) == 0 && Objects.equals(id, time.id) && Objects.equals(nome, time.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, valor);
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
