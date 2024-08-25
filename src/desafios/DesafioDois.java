package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DesafioDois {
    private static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        

       Stream<Integer> numerosSteram = numeros.stream();
        /* O método stream(), cria uma nova stream a partir de uma Collection, quando invocado sobre uma Collection*/

        int soma = numerosSteram.filter(n -> n% 2 == 0)
            /*  O método filter(), filtra elementos de um stream com base em um Predicate
            *   É possível usar expressões lambda para substituir a inicialização de um novo objeto do tipo Predicate;
            *   Por exemplo n -> n % 2 == 0 : filtra os elementos da sream com base nessa expressão lambda;
            */
                .mapToInt(elementoStream -> elementoStream.intValue())
                /*  O método mapToInt() retorna uma IntSteam baseada no argumento que é passada a ele. O argunmento é uma functional interface, logo é possível usar uma lambda expression
                    ou method reference. Logo, a expresão acima pega os elemtnos da stream e os manipula, aplicando o método intValue() sobre cada elemento da stream, nesse caso, cada elemento
                    da stream é do tipo Integer, que por sua vez permite o uso do metodo intValue();
                * 
                */
                    .sum();
                    /* sum() soma os elemntos da stream - tipos primitivos */


        System.out.println(soma);
        


       

        
    }

}
