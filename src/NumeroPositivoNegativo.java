import java.util.Scanner;

public class NumeroPositivoNegativo {

    private int numero;

    public NumeroPositivoNegativo(int numero) {
        this.numero = numero;
    }

    public void verificarNumero() {
        if (this.numero > 0) {
            System.out.println("El número es positivo.");
        } else if (this.numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();
        NumeroPositivoNegativo npn = new NumeroPositivoNegativo(numero);
        npn.verificarNumero();
    }
}
