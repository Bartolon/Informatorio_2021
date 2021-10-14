package level_1;
/* Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia*/
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese la base");
		int base = scan.nextInt();
		System.out.println("Ingrese la potencia");
		int exponente = scan.nextInt();
		scan.close();
		int potencia = 1;
	for (int i = 0; i < exponente; i++) {
		potencia = potencia * base;
						}
		System.out.println(base + " elevado a la " + exponente + " = " + potencia);
						}
			}