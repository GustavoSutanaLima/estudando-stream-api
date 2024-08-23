import java.util.*;

    public class LambdaExpressions {
        public static void main(String[] args) {
             /*
         * List<T> é uma Collection, assim como Set<T>;
         * 
         * Collection tem um método stream(), que inicia um stream;
         */
        
            List<String> listaDeNomes = Arrays.asList("Gustavo", "Maria", "Antônio");  

            listaDeNomes.stream().map(nome -> nome + " Lima").forEach(System.out::println);

            listaDeNomes.forEach(nome -> System.out.println(nome)); 
        

        }
       

    }