import java.util.Scanner;

public class TablaMultiplicar {

    private int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public void mostrarTabla() {
        System.out.println("La tabla de multiplicar del " + this.numero + " es:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.numero + " x " + i + " = " + (this.numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();
        TablaMultiplicar tm = new TablaMultiplicar(numero);
        tm.mostrarTabla();
    }
}
