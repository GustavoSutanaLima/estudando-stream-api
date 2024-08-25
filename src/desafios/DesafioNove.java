package desafios;

import java.util.*;
import java.util.function.Predicate;
public class DesafioNove {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 3);

        var resultado = numeros.stream().distinct().count() == numeros.size() ? "Não há elementos iguais" : "Há elementos iguais";

        System.out.println(resultado);

        }
}

class numerosDiferentes implements Predicate<Integer> {
    @Override
    public boolean test(Integer elementoStream) {
        return elementoStream > 2;
    }
}
