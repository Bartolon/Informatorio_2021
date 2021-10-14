package level_1;

public class Ejercicio8 {
	private String nombreyApellido= " Eduardo Ortiz ";
	private String edad= " 4300 ";
	private String direccion= " De la Sota 120 ";
	private String ciudad= " Guayaquil ";
	public void print(){
		System.out.print(ciudad + " - " + direccion + " - " + edad + " - " + nombreyApellido);
				}
	public static void main(String[] args) {
		Ejercicio8 prueba = new Ejercicio8();
		prueba.print();		
			}
}