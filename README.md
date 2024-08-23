<h1>Stream API </h1>

<h2> Estudos relacionados à Programação Funcional em Java </h2>

* Aplicação de expressões lâmbina: (argumento) -> (corpo)

```java
    import java.util.*;

    public class LambdaExpressions {
        List<String> listaDeNomes = Arrays.asList("Gustavo", "Maria", "Antônio");

        listaDeNomes.stream().map(nome -> nome + " Lima").forEach(System.out::println);

        listaDeNomes.forEach(nome -> System.out.println(nome)); 

    }
```

