import java.util.Scanner;

public class NumerosHastaN {

    private int n;

    public NumerosHastaN(int n) {
        this.n = n;
    }

    public void imprimirNumeros() {
        int i = 1;
        while (i <= this.n) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número:");
        int n = scanner.nextInt();
        NumerosHastaN nhn = new NumerosHastaN(n);
        nhn.imprimirNumeros();
    }
}
