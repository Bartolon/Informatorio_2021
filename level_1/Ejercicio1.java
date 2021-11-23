package level_1;
import java.util.Scanner;
/*Solicitar por consola el nombre del usuario e imprimir por pantalla
el siguiente mensaje “HOLA {USUARIO}!!!”*/

public class Ejercicio1 { //como clase pública podrá llamarse desde cualquier sitio del entorno.
	public static void main(String[] args) { //static xq no necesita instanciar para acceder al metodo - void por que no retorna algo la funcion, solo ejecuta code.
	Scanner scan = new Scanner(System.in); //instancia de clase Scanner para dar entrada a valor por consola.
	String nombre = scan.nextLine(); // nombre = variable que recibira y almacena el valor cargado por consola, mediante el método scan.
	scan.close(); //método de la clase Scanner que cierra la ejecución y permite la creación 'segura' y compacta del objeto de la clase.
	System.out.println("HOLA " + nombre);
	}
 }