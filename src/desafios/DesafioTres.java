package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioTres {
    private static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {

        /*allMatch, retorna true or false se todos os elementos de uma stream respeitam uma determinada condiação ou não */
        boolean condicao = numeros.stream().allMatch(elementoStream -> elementoStream > 0);

        System.out.println(condicao);


    }   
}
