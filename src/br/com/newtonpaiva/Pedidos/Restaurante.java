package br.com.newtonpaiva.Pedidos;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();

        int opcao;
        String nome;
        Double valor;
        Integer borda, artesanal;


        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("(1) Pizza\n(2)Hamburguer\n(3)Sair"));
            if (opcao == 1) {
                nome = JOptionPane.showInputDialog("Entre com o nome: ");
                valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor: "));
                borda = Integer.parseInt(JOptionPane.showInputDialog("Quer Borda ?!\n(1)Sim\n(2)Não"));
                if (borda == 2 || borda == 1) {
                    p1.setValor(p1.CalculaValor(borda, valor));
                    JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de " + p1.getValor(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "Resultado", JOptionPane.ERROR_MESSAGE);
            }
            if (opcao == 2) {
                nome = JOptionPane.showInputDialog("Entre com o nome: ");
                valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor: "));
                artesanal = Integer.parseInt(JOptionPane.showInputDialog("O Hamburguer será artesanal ?\n(1)Sim\n(2)Não"));

                h1.setValor(h1.CalculaValor(artesanal, valor));

                JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de "+ h1.getValor(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
            if (opcao > 3 || opcao < 0)
                JOptionPane.showMessageDialog(null, "Opção Inválida", "Resultado", JOptionPane.ERROR_MESSAGE);
        }while (opcao != 3);
    }

}
