import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        
        // Comprobar la condición de año bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}