package segundos_pasos;
import java.util.Scanner;


public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palanra ");
        String cadena1 = scanner.nextLine();
        
        System.out.print("Ingresa otra parabras ");
        String cadena2 = scanner.nextLine();
        
        if (esAnagrama(cadena1, cadena2)) {
            System.out.println("Las palabras son anagramas.");
        } else {
            System.out.println("Las palabras no son anagramas.");
        }
        
        scanner.close();
    }
    
    public static boolean esAnagrama(String cadena1, String cadena2) {
        cadena1 = cadena1.replaceAll("\\s", "").toLowerCase();
        cadena2 = cadena2.replaceAll("\\s", "").toLowerCase();
        
        if (cadena1.length() != cadena2.length()) {
            return false;
        }
        
        StringBuilder builder = new StringBuilder(cadena2);
        
        for (char c : cadena1.toCharArray()) {
            int index = builder.indexOf(String.valueOf(c));
            if (index == -1) {
                return false;
            }

            builder.deleteCharAt(index);
        }
        
        return builder.length() == 0;
    }
}

