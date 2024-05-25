import java.util.Scanner;

public class Factorial {

    private int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }

    public void calcularFactorial() {
        long factorial = 1;
        for (int i = 1; i <= this.numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + this.numero + " es: " + factorial);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();
        Factorial f = new Factorial(numero);
        f.calcularFactorial();
    }
}
