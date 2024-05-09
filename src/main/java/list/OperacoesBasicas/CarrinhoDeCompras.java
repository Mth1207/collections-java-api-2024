package main.java.list.OperacoesBasicas;

import java.util.*;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
       Item item = new Item(nome, preco, quantidade);
       this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item it : itemList){
                if(it.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(it);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public double valorTotalItens() {
        double valorTotal = 0d;
        if(!itemList.isEmpty()) {
            for (Item itens : itemList) {
                double valorItem = itens.getPreco() * itens.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Lista Vazia!");
        }
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Caneta", 2.50d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2.50d, 1);
        carrinhoDeCompras.adicionarItem("Caderno", 20.50d, 1);
        carrinhoDeCompras.adicionarItem("Lapis de cor", 10.50d, 1);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Caderno");

        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total da compra: R$" + carrinhoDeCompras.valorTotalItens());
    }
}
