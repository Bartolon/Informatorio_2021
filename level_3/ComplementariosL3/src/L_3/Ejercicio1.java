package L_3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
            palabras.add("Hola");
            palabras.add(null);
            palabras.add("Informatorio");
            palabras.add("");
        List<String> resultado = palabras.stream()
            .filter(palabra -> palabra != null)
            .filter(palabra -> palabra != "")
            .collect(Collectors.toList());
        System.out.println(resultado);
    }
}

//["Hola", "Informatorio"]
