package level_1;
import java.util.*;
/*solicite por consola 2 números enteros.Para luego imprimir el resultado 
de la suma, resta, multiplicación, división y módulo de ambos números. */
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int ent1 = scan.nextInt();
		int ent2 = scan.nextInt();
		scan.close(); //La clase Scanner una vez instanciada puede reusasrse en varios llamados, por eso se crean las dos variables.
		
		int suma= ent1+ent2; //asignación de tipo de dato, nombramiento e inicializacion de las variables.//
		int resta= ent1-ent2;
		int multiplicacion=ent1*ent2;
		int division=ent1/ent2;
		int modulo = ent1%ent2;	
		
		System.out.println(ent1 + " + " + ent2 +" = "+ suma);
		System.out.println(ent1 + " - " + ent2 +" = "+ resta);
		System.out.println(ent1 + " * " + ent2 + " = " + multiplicacion);
		System.out.println(ent1 + " / " + ent2 + " = " + division);
		System.out.println(ent1 + " % " + ent2 +" = "+ modulo);
						}	
			}
