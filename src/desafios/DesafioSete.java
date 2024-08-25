package desafios;

import java.util.*;

public class DesafioSete {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 23, 11, 5, 4, 3);

        var maiorElemento = numeros.stream().max(new ComparadorParaMaiorNumero()).get();

        System.out.println(maiorElemento);

        var segundoMaiorElemento = numeros.stream().filter(elemento -> elemento < maiorElemento).max(new ComparadorParaMaiorNumero()).get();

        System.out.println(segundoMaiorElemento);
    }
}

class ComparadorParaMaiorNumero implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1.intValue(), o2.intValue());
    }
}
