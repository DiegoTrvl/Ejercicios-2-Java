import java.util.Scanner;

public class SecuenciaFibonacci {

    private int limite;

    public SecuenciaFibonacci(int limite) {
        this.limite = limite;
    }

    public void generarSecuencia() {
        int num1 = 0, num2 = 1;
        System.out.println("La secuencia de Fibonacci hasta " + this.limite + " es:");

        while (num1 <= this.limite) {
            System.out.print(num1 + " ");

            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número:");
        int limite = scanner.nextInt();
        SecuenciaFibonacci sf = new SecuenciaFibonacci(limite);
        sf.generarSecuencia();
    }
}
