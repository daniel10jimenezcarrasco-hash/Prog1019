import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================");
        System.out.println("   9. Calculadora básica   ");
        System.out.println("===========================");
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (x)");
        System.out.println("4. División (÷)");
        System.out.print("Ingrese su opción (1-4): ");
        
        int nota = scanner.nextInt();
        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        boolean operacionValida = true;
        
        switch (nota) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
                break;
        }
        
        if (operacionValida) {
            System.out.println("El resultado de la operación es: " + resultado);
        }
        
        scanner.close();
    }
}