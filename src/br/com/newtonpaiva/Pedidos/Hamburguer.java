package br.com.newtonpaiva.Pedidos;

public class Hamburguer {

    private String nome;
    private Double valor;
    private Boolean artesanal;

    public void CalculaValor(Boolean artesanal){
        if (artesanal)
            valor = valor + 8;
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

    public Boolean getArtesanal() {
        return artesanal;
    }

    public void setArtesanal(Boolean artesanal) {
        this.artesanal = artesanal;
    }
}
