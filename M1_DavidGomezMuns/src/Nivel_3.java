
public class Nivel_3 {
	
	public static void main(String[] s) {
		// Inicializar array
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		// Llamar método rotarArray() y guardar valor devuelto en una variable
		int [] arrayRotado = rotarArray(array);
		
		// Imprimir array rotado
		for(int i = 0; i < arrayRotado.length; i++) {
			System.out.print(arrayRotado[i] + " ");
		}
	}
	
	// Método para rotar un array hacia la derecha
	public static int[] rotarArray(int [] array) {	
		
		int i;
		
		// Guardar el último elemento del array en una variable temporal
		int temp = array[array.length-1];		
			
		for(i = array.length-1; i > 0; i--) {
			
			// Desplazar una posición a la derecha cada elemento del array 
			array[i] = array[i-1];	
		}
		// Guardar el último elemento en la primera posición del array
		array[0] = temp;
		
		// Devolver el array
		return array;
	}

}
