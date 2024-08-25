package desafios;

import java.util.*;
import java.util.function.Predicate;

public class DesafioDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 5, 4, 30, 45);

        var numerosResultado = numeros.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t.intValue() % 3 == 0 && t.intValue() % 5 == 0 && t.intValue() % 2 != 0;
            }
        });

        System.out.println(numerosResultado.toList());
    }
}
