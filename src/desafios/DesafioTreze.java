package desafios;

import java.util.*;
import java.util.function.*;

public class DesafioTreze {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("num1");
        int num1 = scanner.nextInt();
        System.out.println("num2");
        int num2 = scanner.nextInt();

        try {
            var streamNumerosEntreNum1ENum2 = numeros.stream().filter(new Predicate<Integer>() {
                @Override
                public boolean test(Integer t) {
                    return t.intValue() < num2 && t.intValue() > num1;
                }
            }).sorted();
            System.out.println(streamNumerosEntreNum1ENum2.toList());
        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }
    }
}

