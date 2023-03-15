package br.com.newtonpaiva.Pedidos;

public class Main {
    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();

        p1.setNome("Calabresa");

        System.out.println(p1.getNome());

        p1.setValor(20.0);

        System.out.println(p1.getValor());

        h1.setNome("X-Bacon");

        System.out.println(h1.getNome());

        h1.setValor(10.0);
        h1.CalculaValor(true);

        System.out.println(h1.getValor());




    }
}
