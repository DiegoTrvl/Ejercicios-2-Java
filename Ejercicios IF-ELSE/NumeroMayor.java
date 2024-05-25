import java.util.Scanner;

public class NumeroMayor {

    private int num1;
    private int num2;
    private int num3;

    public NumeroMayor(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void mostrarMayor() {
        if (this.num1 > this.num2 && this.num1 > this.num3) {
            System.out.println("El número mayor es: " + this.num1);
        } else if (this.num2 > this.num1 && this.num2 > this.num3) {
            System.out.println("El número mayor es: " + this.num2);
        } else {
            System.out.println("El número mayor es: " + this.num3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Por favor, ingresa el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Por favor, ingresa el tercer número:");
        int num3 = scanner.nextInt();
        NumeroMayor nm = new NumeroMayor(num1, num2, num3);
        nm.mostrarMayor();
    }
}
