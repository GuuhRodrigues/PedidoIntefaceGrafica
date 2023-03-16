package br.com.newtonpaiva.Pedidos;

public class Pizza {

    private String nome;
    private Double valor;
    private Integer borda;

    public Double CalculaValor(Integer borda, Double valor) {
        if (borda == 1)
            valor = valor + 5;
        return valor;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Double getValor() {

        return valor;
    }

    public void setValor(Double valor) {

        this.valor = valor;
    }

    public Integer getBorda() {

        return borda;
    }

    public void setBorda(Integer borda) {

        this.borda = borda;
    }
}
