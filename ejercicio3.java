package segundos_pasos;
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		String palabra_inver = "";
		for(int i = palabra.length() - 1; i >= 0; i--) {
			palabra_inver += palabra.charAt(i);
		}
		System.out.println("Las palabras quedan asi:\nPalabra original: " + palabra + "\nPalabra invertida " + palabra_inver);
		
		boolean palindromosino = palabra.equals(palabra_inver);
		if(palindromosino == true) System.out.println("La palabra es palindroma");
		else System.out.println("La palabra no es palindroma");
;	}
}
