package br.com.newtonpaiva.Pedidos;

public class Hamburguer {

    private String nome;
    private Double valor;
    private Integer artesanal;

    public Double CalculaValor(Integer artesanal, Double valor){
        if (artesanal == 1)
            valor = valor + 8;
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

    public Integer getArtesanal() {
        return artesanal;
    }

    public void setArtesanal(Integer artesanal) {
        this.artesanal = artesanal;
    }
}
