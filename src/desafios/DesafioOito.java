package desafios;

import java.util.*;

public class DesafioOito {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        var soma = numeros.stream().reduce(0, (elemento, proximoElemento) -> (elemento+=proximoElemento));

        System.out.println(soma.intValue());
    }
}
