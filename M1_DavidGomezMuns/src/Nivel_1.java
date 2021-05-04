import java.util.ArrayList;

public class Nivel_1 {
	//Campos de clase
	private static String nombre, apellido1, apellido2, printAnyoBisiesto;
	private static int dia, mes, anyo;
	private static final int anyoInicio = 1948;
	private static ArrayList<Integer> lista;
	private static boolean esBisiesto;
	
	// Constructor de clase. Inicialización de variables
	public Nivel_1() {
		nombre = "Jordi";
		apellido1 = "Pérez";
		apellido2 = "Castells";
		dia = 20;
		mes = 10;
		anyo = 1984;
		lista = new ArrayList<Integer>();
	}
	// Método main
	public static void main(String[] args) {
		// Instancia de clase
		Nivel_1 n1 = new Nivel_1();
		
		// Llamada métodos de clase
		fase_1();
		System.out.println();
		fase_2();
		System.out.println();
		fase_3();
		System.out.println();
		fase_4();		

	}
	// Método para imprimir datos
	public static void fase_1() {
		System.out.println(apellido1 + " " + apellido2 + ", " + nombre);
		System.out.println(dia + "/" + mes + "/" + anyo); 
	}
	
	// Método para calcular años bisiestos, guardar en array e imprimir resultado
	public static void fase_2() {
		
		for(int i = anyoInicio; i <= anyo; i++) {
			if(i % 4 == 0 && (!(i % 100 == 0) || i % 400 == 0)){
				lista.add(i);
			}
		}
		System.out.println("Años bisiestos desde " + anyoInicio + " hasta " + anyo + ":");
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + ", ");
		}
		System.out.println("\nNúmero de años bisiestos desde " + anyoInicio + " hasta "+ anyo + ": " + lista.size());

	}
	 // Método para comprobar si año de nacimiento es bisiesto e imprimir resultado
	public static void fase_3() {
		esBisiesto = anyo % 4 == 0 && (!(anyo % 100 == 0) || anyo % 400 == 0);
		
		if(esBisiesto){
			printAnyoBisiesto = "El año " + anyo + " es bisiesto.";
		}else {
			printAnyoBisiesto = "El año " + anyo + " no es bisiesto.";
		}
		System.out.println(printAnyoBisiesto);
	}
	
	public static void fase_4() {
		String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
		String fechaNacimiento = dia + "/" + mes + "/" + anyo;
		System.out.println("Mi nombre es " + nombreCompleto + ".");
		System.out.println("Nací el " + fechaNacimiento + ".");
		if(esBisiesto) {
			System.out.println("El año de mi nacimiento fué bisiesto.");
		}else {
			System.out.println("El año de mi nacimiento no fué bisiesto.");
		}
	}
	
}
