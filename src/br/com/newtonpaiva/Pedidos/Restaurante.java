package br.com.newtonpaiva.Pedidos;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {

        Pizza p1 = new Pizza();

        int opcao;
        String nome;
        Double valor;
        Boolean borda;


        opcao = Integer.parseInt(JOptionPane.showInputDialog("(1) Pizza\n(2)Hamburguer\n(3)Sair"));

        if (opcao == 1){
            nome = JOptionPane.showInputDialog("Entre com o nome: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor: "));
            borda = Boolean.parseBoolean(JOptionPane.showInputDialog("Quer Borda ?!\n(1)Sim\n(2)Não"));
            p1.setValor(p1.CalculaValor(borda, valor));

            JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de " + p1.getValor() , "Resultado", JOptionPane.INFORMATION_MESSAGE );
        }
    }

}
