 package level_1;
 /*imprime la factorización de un numero*/
 import java.util.*;

  public class Ejercicio4 {
      public static void main(String[] args) {
		Scanner n_ingresado = new Scanner(System.in);
		System.out.print("Introduzca un numero entero: ");
		Integer numero = n_ingresado.nextInt();
		System.out.printf("El factorial de %d es %.0f\n ", numero, factorial(numero));
		n_ingresado.close();
			}
      public static double factorial(int n) {
	  double num = 1;
	  for (int i = 1; i<=n; i++) { //el bucle establece la condicion para multiplicar por si mismo al numero que decrementa, asi se logra factorizar.
	      num = num*i;		//en cada vuelta i dercrementa y se multiplica por num logrando factorizarse.
      					}
	  return num;
      						}
				}