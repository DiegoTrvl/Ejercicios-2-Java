import java.util.Scanner;

public class AñoBisiesto {

    private int ano;

    public AñoBisiesto(int ano) {
        this.ano = ano;
    }

    public void verificarAno() {
        if ((this.ano % 4 == 0 && this.ano % 100 != 0) || this.ano % 400 == 0) {
            System.out.println("El año " + this.ano + " es bisiesto.");
        } else {
            System.out.println("El año " + this.ano + " no es bisiesto.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un año:");
        int ano = scanner.nextInt();
        AñoBisiesto ab = new AñoBisiesto(ano);
        ab.verificarAno();
    }
}
