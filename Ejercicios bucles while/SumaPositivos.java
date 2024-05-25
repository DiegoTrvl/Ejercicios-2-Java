import java.util.Scanner;

public class SumaPositivos {

    public void sumarNumeros() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Por favor, ingresa números positivos (ingresa un número negativo para detener):");

        do {
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }

    public static void main(String[] args) {
        SumaPositivos sp = new SumaPositivos();
        sp.sumarNumeros();
    }
}
