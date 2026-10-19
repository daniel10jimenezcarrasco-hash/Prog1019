import java.util.Scanner;

public class TrianguloChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la longitud del primer lado (a):");
        double a = scanner.nextDouble();

        System.out.println("Introduce la longitud del segundo lado (b):");
        double b = scanner.nextDouble();

        System.out.println("Introduce la longitud del tercer lado (c):");
        double c = scanner.nextDouble();

        // Verificar si pueden formar un triángulo
        // La suma de las longitudes de dos cualesquiera debe ser mayor que la longitud del tercero
        boolean esTriangulo = (a + b > c) && (a + c > b) && (b + c > a);

        if (esTriangulo) {
            System.out.println("\nLos lados dados SÍ pueden formar un triángulo.");

            // Clasificar según sus lados
            if (a == b && b == c) {
                System.out.println("Es un triángulo **Equilátero** (todos los lados iguales).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Es un triángulo **Isósceles** (dos lados iguales).");
            } else {
                System.out.println("Es un triángulo **Escaleno** (ningún lado igual).");
            }
        } else {
            System.out.println("\nLos lados dados NO pueden formar un triángulo[cite: 1].");
        }

        scanner.close();
    }
}