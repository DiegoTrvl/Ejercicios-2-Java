import java.util.Scanner;

public class NumeroParImpar {

    private int numero;

    public NumeroParImpar(int numero) {
        this.numero = numero;
    }

    public void verificarNumero() {
        if (this.numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();
        NumeroParImpar npi = new NumeroParImpar(numero);
        npi.verificarNumero();
    }
}
