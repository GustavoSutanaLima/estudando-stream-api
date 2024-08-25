package desafios;

import java.util.*;
import java.util.function.BinaryOperator;

public class DesafioOnze {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        var soma = numeros.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t+=u*u;
            }
        });

        System.out.println(soma);
    }
}
