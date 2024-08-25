package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DesafioCinco {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Stream<Integer> numerosMaioresQueCincoStream = numeros.stream().filter(elementoStream -> elementoStream > 5); //cria uma nova stream com os elementos maiores que 5

        var media = numerosMaioresQueCincoStream.mapToInt(elementoStream -> elementoStream.intValue()).average();
        
        System.out.println(media.getAsDouble());

    }
}
