package br.com.newtonpaiva.Pedidos;

public class Pizza {

    private String nome;
    private Double valor;
    private Boolean borda;

    public Double CalculaValor(Boolean borda, Double valor){
        if (borda)
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

    public Boolean getBorda() {
        return borda;
    }

    public void setBorda(Boolean borda) {
        this.borda = borda;
    }
}
