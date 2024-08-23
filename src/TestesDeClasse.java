public class TestesDeClasse {
    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem(123.45, 10);
        carrinho.adicionarItem(234.56, 20);
        carrinho.adicionarItem(456.78, 30);

        System.out.println(carrinho.calcularValorTotal());
        
    }
}
