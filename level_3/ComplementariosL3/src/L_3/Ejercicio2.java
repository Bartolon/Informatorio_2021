package L_3;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.Math;
import java.util.stream.Stream;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
                Stream<Integer> cuadrados =numeros.stream()
                .map(numero-> (int)Math.pow(numero, 2));
                System.out.println(cuadrados.collect(Collectors.toList()));
    }
}


