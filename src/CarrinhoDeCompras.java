import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;
    //construtor
    public CarrinhoDeCompras() {
      this.itemList = new ArrayList<>();
    }

    public void adicionarItem(double preco, int quantidade) {
      itemList.add(new Item(preco, quantidade));
    }
    
    //método para calcular valor total dos itens utilizando o Stream API
    public double calcularValorTotal() {
      if (itemList.isEmpty()) {
        throw new RuntimeException("A lista está vazia!");
      }
      return itemList.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();
    }
  }