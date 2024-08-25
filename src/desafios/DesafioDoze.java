package desafios;

import java.util.*;
import java.util.function.*;

public class DesafioDoze {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4);

        var produto = numeros.stream().reduce(1, new OperadorBinarioProduto());

        System.out.println(produto.intValue());
    }
}

class OperadorBinarioProduto implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer t, Integer u) {
        return t*u;
    }
}
