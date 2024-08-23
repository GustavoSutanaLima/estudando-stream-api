package desafios;

import java.util.*;

public class DesafioUm {
    
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Utilizando programação orientada a objetos e method reference;
    public void organizadorUm() {
        numeros = numeros.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        }).toList();
        numeros.forEach(System.out::print);
    }

    //Utilizando programação funcional mais lambda expression
    public void organizadorDois() {
        numeros = numeros.stream().sorted((n1, n2) -> (Integer.compare(n1, n2))).toList();
        System.out.println(numeros);
    }

}
//Criando uma classe anônima para testes.:
class ClasseAnonimaTest {
    public static void main(String[] args) {
        DesafioUm d1 = new DesafioUm();
        
        d1.organizadorUm();
        System.out.println("**************************");
        d1.organizadorDois();
    }
}
