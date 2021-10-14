package level_2;
import java.util.*;
/*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos. Ayuda: ArrayList posee un 
método para particionar en sub-listas?*/
public class Ejercicio4 {
public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        ArrayList<String> alumnos = new ArrayList<>();
	int cantidadAlumnos = 12;
	int a, b, c, d;
	a = 0;
	b = cantidadAlumnos/3;
	c = b+b;
	d = cantidadAlumnos;
	String alumno;
	for (int i = 0; i < cantidadAlumnos; i++) {
		System.out.println("Ingresar alumnos: ");
		alumno = scan.nextLine();
		alumnos.add(alumno);
						}
	System.out.println(alumnos);
	List<String> subAlumnos1 = alumnos.subList(a, b);
	List<String> subAlumnos2 = alumnos.subList(b, c);
	List<String> subAlumnos3 = alumnos.subList(c, d);
	System.out.println("Primer curso: " + " " + subAlumnos1);
	System.out.println("Segundo curso: " + " " + subAlumnos2);
	System.out.println("Tercer curso: " + " " + subAlumnos3);
	scan.close();
	}
}	