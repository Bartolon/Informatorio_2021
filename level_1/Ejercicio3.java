package level_1;
// programa que imprime las cifras incluidas en un numero entero // 
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int nro_ent = scan.nextInt(); //el primitivo int no permite null
		scan.close();
		
		for(int i =1; i <=nro_ent; i++){ //itera sobre lo que se carga por scan
			for(int j=1; j<i;j++){   //itera sobre el componente del numero i para poder imprimir las cifras que lo componen en cada vuelta de bucle
				System.out.print(j);//imprime j siempre que sea menor a i
						}	
				System.out.println (i);//imprime i una vez cumplida la condicion de menor sobre j
						}
						}
			}
