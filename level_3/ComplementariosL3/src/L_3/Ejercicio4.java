package L_3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> factores = List.of(0, 1, 2, 4, 4, 4);
        List<Integer> pfactores = factores.stream()
                .map(p -> Ejercicio4.factorial(p))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(pfactores);
    }
    public static Integer factorial(Integer numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}