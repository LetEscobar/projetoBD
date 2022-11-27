import java.time.LocalDate;

public class Car {
    private int id;
    private String nome;
    private LocalDate dt_fabricacao;
    private double valor;

    // -------------- Getters and setters --------------
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDt_fabricacao() {
        return this.dt_fabricacao;
    }

    public void setDt_fabricacao(LocalDate dt_fabricacao) {
        this.dt_fabricacao = dt_fabricacao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}