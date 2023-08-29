package segundos_pasos;
import java.util.Scanner;

public class ejericico2 {
	public static void main(String Argc[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		int cont_vocales = 0;
		char letraa = 'a';
		char letrae = 'b'; 
		char letrai = 'i';
		char letrao = 'o'; 
		char letrau = 'u';
		char caracter;
		for(int i = 0; i < palabra.length(); i++) {
			caracter = Character.toLowerCase(palabra.charAt(i));
			if(caracter == Character.toLowerCase(letraa) || caracter == Character.toLowerCase(letrae) || caracter == Character.toLowerCase(letrai) || caracter == Character.toLowerCase(letrao) || caracter == Character.toLowerCase(letrau)) {
				cont_vocales ++;
			}
			
		}
		System.out.println("La cantidad de vocales que tiene " + palabra + " son " + cont_vocales);
	}
}
