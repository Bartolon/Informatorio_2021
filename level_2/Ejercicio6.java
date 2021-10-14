package level_2;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args)  {
	    Set<String> empleados = new HashSet<>();
		empleados.add("Campodónico Silvia, 30430511, 2, 300");
		empleados.add("Cayre Ely, 30522666, 6, 600");
		empleados.add("Mijalú Rebeca, 14315699, 5, 1200");
		empleados.add("Ledesma Lucas, 9365899, 1, 305000");
	    Map<String, Integer> haberes = new HashMap<String, Integer>();
	    
	    for(String empleado : empleados){
		String[] partes= empleado.split(", ");
		int horasTrab= Integer.parseInt(partes[2]);
		int valorHora = Integer.parseInt(partes[3]);
		int sueldo= horasTrab*valorHora;
		haberes.put(partes[1], sueldo);
						}
	System.out.println(haberes);
	}
}