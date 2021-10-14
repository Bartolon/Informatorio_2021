package level_1;
/*Realizar un programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen
toUppercase().*/
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese una palabra en minúscula: ");
        String palabra = scan.nextLine();
        scan.close();
        char caracteres='a';
        int bandera = 0;
        for (int i = 0; i < palabra.length(); i++){
            if ('A' <= palabra.charAt(i) && palabra.charAt(i) <= 'Z'){
            bandera+=1;
            }}

        if (bandera == 0){
            for (int i = 0; i < palabra.length(); i++){
                if ('a' <= palabra.charAt(i) && palabra.charAt(i) <= 'z'){
                caracteres= (char)(palabra.charAt(i)-32);
                System.out.print(caracteres);}}}
        
        else {System.out.println("Ingrese UNICAMENTE minúsculas!");
            }
    }
}
                                            
                        