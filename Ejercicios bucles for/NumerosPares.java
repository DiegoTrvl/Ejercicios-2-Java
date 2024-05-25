public class NumerosPares {

    public void imprimirNumeros() {
        System.out.println("Los números pares del 2 al 20 son:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NumerosPares np = new NumerosPares();
        np.imprimirNumeros();
    }
}
