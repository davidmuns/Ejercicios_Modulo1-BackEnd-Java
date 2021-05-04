import java.util.ArrayList;

public class Nivel_1 {
	//Campos de clase
	private static String nombre, apellido1, apellido2, printAnyoBisiesto;
	private static int dia, mes, anyo;
	private static final int anyoInicio = 1948;
	private static ArrayList<Integer> lista;
	private static boolean esBisiesto;
	
	// Constructor de clase. Inicializaci�n de variables
	public Nivel_1() {
		nombre = "Jordi";
		apellido1 = "P�rez";
		apellido2 = "Castells";
		dia = 20;
		mes = 10;
		anyo = 1984;
		lista = new ArrayList<Integer>();
	}
	// M�todo main
	public static void main(String[] args) {
		// Instancia de clase
		Nivel_1 n1 = new Nivel_1();
		
		// Llamada m�todos de clase
		fase_1();
		System.out.println();
		fase_2();
		System.out.println();
		fase_3();
		System.out.println();
		fase_4();		

	}
	// M�todo para imprimir datos
	public static void fase_1() {
		System.out.println(apellido1 + " " + apellido2 + ", " + nombre);
		System.out.println(dia + "/" + mes + "/" + anyo); 
	}
	
	// M�todo para calcular a�os bisiestos, guardar en array e imprimir resultado
	public static void fase_2() {
		
		for(int i = anyoInicio; i <= anyo; i++) {
			if(i % 4 == 0 && (!(i % 100 == 0) || i % 400 == 0)){
				lista.add(i);
			}
		}
		System.out.println("A�os bisiestos desde " + anyoInicio + " hasta " + anyo + ":");
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + ", ");
		}
		System.out.println("\nN�mero de a�os bisiestos desde " + anyoInicio + " hasta "+ anyo + ": " + lista.size());

	}
	 // M�todo para comprobar si a�o de nacimiento es bisiesto e imprimir resultado
	public static void fase_3() {
		esBisiesto = anyo % 4 == 0 && (!(anyo % 100 == 0) || anyo % 400 == 0);
		
		if(esBisiesto){
			printAnyoBisiesto = "El a�o " + anyo + " es bisiesto.";
		}else {
			printAnyoBisiesto = "El a�o " + anyo + " no es bisiesto.";
		}
		System.out.println(printAnyoBisiesto);
	}
	
	public static void fase_4() {
		String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
		String fechaNacimiento = dia + "/" + mes + "/" + anyo;
		System.out.println("Mi nombre es " + nombreCompleto + ".");
		System.out.println("Nac� el " + fechaNacimiento + ".");
		if(esBisiesto) {
			System.out.println("El a�o de mi nacimiento fu� bisiesto.");
		}else {
			System.out.println("El a�o de mi nacimiento no fu� bisiesto.");
		}
	}
	
}
