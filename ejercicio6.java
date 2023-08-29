package segundos_pasos;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cadenaMasLarga = obtenerCadenaMasLarga(scanner);
        
        if (cadenaMasLarga != null) {
            System.out.println("La palabra larga es: " + cadenaMasLarga);
        }
        
        scanner.close();
    }
    
    public static String obtenerCadenaMasLarga(Scanner scanner) {
        String cadenaMasLarga = null;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa la palabra " + i + ": ");
            String palabra = scanner.nextLine();
            
            if (cadenaMasLarga == null || palabra.length() > cadenaMasLarga.length()) {
                cadenaMasLarga = palabra;
            }
        }
        
        return cadenaMasLarga;
    }
}
