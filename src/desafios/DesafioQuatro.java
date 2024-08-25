package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesafioQuatro {
   
    public static void main(String[] args) {
      
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); //Coleção imutável - Nesse caso, vamos ter uma exeção, pois listas criadas a partir do método asList() são imutáveis;

        numeros = new ArrayList<>(numeros); //Coleção mutável
        System.out.println("Numeros: "+ numeros);

        List<Integer> numerosParaRemover = numeros.stream().filter(elementoStream -> elementoStream % 2 != 0).toList();
        System.out.println("Numeros para remover: " + numerosParaRemover); //lista de números ímpares
        
        numeros.removeAll(numerosParaRemover);
        //removeAll() é um metodo da Classe Collections API e não um método da Stream API: ATENÇÃO, ALTERA A LISTA ORIGINAL;

        System.out.println(numeros);


        
    }
}
