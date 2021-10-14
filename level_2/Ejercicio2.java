package level_2;
import java.util.*;
/*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero
al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a 
en la primera y última posición).*/

public class Ejercicio2 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int j = 5;
		int numero = 0;
		for (int i = 0; i <j; i++) {
			System.out.print("numeros" + (i+1)+" : ");
			numero = sc.nextInt();
			numeros.add(numero);		
						}
		System.out.println(numeros);
		int largoInicial = numeros.size();
		System.out.print("Ingrese posición '0': ");
		int pinicial = sc.nextInt();
		numeros.add(0, pinicial);
		System.out.print("Ingrese posición '-1': ");
		int pfinal = sc.nextInt();
		numeros.add(pfinal);
		int largoFinal = numeros.size();
		System.out.println("Largo inicial de la lista: " + "" + largoInicial);
		System.out.println("Largo final de la lista: " + "" + largoFinal);
		sc.close();
	}	
}