import java.util.Scanner;

public class SumaPares {

    private int n;

    public SumaPares(int n) {
        this.n = n;
    }

    public void calcularSuma() {
        int suma = 0;
        for (int i = 2; i <= this.n; i += 2) {
            suma += i;
        }
        System.out.println("La suma de todos los números pares desde 1 hasta " + this.n + " es: " + suma);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número entero positivo:");
        int n = scanner.nextInt();
        SumaPares sp = new SumaPares(n);
        sp.calcularSuma();
    }
}
