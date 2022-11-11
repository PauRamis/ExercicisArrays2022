public class Exercici7 {
    public static void main(String[] args) {
        //Què mostra el següent codi?
        int [] a = new int[10];

        //Aquest for omple l'array a dels numeros del 9 al 0
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;

        //Aquest for omple cada posició de a, per la seva oposada, queda del 0 al 4, seguit del 4 al 0.
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];

        //Aquest for imprimeix l'array a numero per numero.
        for (int i = 0; i < 10; i++)
            System.out.println(a[i]);
    }
}
