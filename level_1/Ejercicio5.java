package level_1;
/*Se desea una aplicación que solicite 2 números enteros y realice la operación
 de multiplicación por sumas sucesivas (sin uso de librerías).*/
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int nro1 = scan.nextInt();
		int nro2 = scan.nextInt();
				
		int adicion_sucesiva = 0;
		for(int i =1; i <=nro2; i++){
			adicion_sucesiva += nro1;
						}
		System.out.println (nro1 + " X " + nro2 + " = " +  (adicion_sucesiva));
		System.out.println (nro1 + " X " + nro2 + " = " +  (adicion_sucesiva)+ " = " + "sumar " + nro2 + " veces el " + nro1);
		scan.close();
						}		
			}