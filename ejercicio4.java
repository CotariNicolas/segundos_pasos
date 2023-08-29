package segundos_pasos;
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String Argc[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palbra: ");
		String palabra = scan.nextLine();
		System.out.println("Ingrese la letra que desea cambiar: ");
		char letra_cambiara = scan.next().charAt(0);
		System.out.println("Ingrese la letra por la cual desea cambiarla: ");
		char letra_cambiar = scan.next().charAt(0);
		StringBuilder palabracambiada = new StringBuilder(palabra);
		for(int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			if(letra == letra_cambiara) {
				palabracambiada.setCharAt(i, letra_cambiar);
			}
		}
		System.out.println("La palbara cambiada queda como: " + palabracambiada);
	}
}
