public class Exercici12 {
    public static void main(String[] args) {
        //Donats dos vectors, escriu una funció que retorni el seu producte escalar i una altra funció
        //que retorni el producte vectorial.

        int[] a = {1, 2};
        int[] b = {5, 3};
        producteEscalar(a, b);
        producteVectorial(a, b);
    }

    private static void producteEscalar(int[] a, int[] b) {
        //v1 · v2 = (v1[0] * v2 [0]) + (v1[1] * v2[1])
        System.out.println("Producte Escalar: " + ((a[0] * b[0]) + (a[1] * b[1])));
    }

    private static void producteVectorial(int[] a, int[] b) {
        //
    }

}