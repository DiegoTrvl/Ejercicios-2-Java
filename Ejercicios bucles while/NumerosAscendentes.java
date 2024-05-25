public class NumerosAscendentes {

    public void imprimirNumeros() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        NumerosAscendentes na = new NumerosAscendentes();
        na.imprimirNumeros();
    }
}
