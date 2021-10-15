package level_2;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //scan.close();

        try {
            int top = 3;
        String ciudad;
        int i;
            for (i = 0; i < top; i++) {
                System.out.print("Cargue sus ciudades favoritas de Argentina: ");
                ciudad = scan.nextLine();
                ciudades.add(ciudad);
                                        }
       
            System.out.println("Su ranking de ciudades favoritas de Argentina es: ");
            for (i = 0; i < top; i++) {
                System.out.println("#"+(i+1)+" "+ciudades.get(i));
                                        }
        }
        finally{
            scan.close();
        }
            
            }
}        