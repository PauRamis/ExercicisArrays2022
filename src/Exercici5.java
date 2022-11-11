public class Exercici5 {
    public static void main(String[] args) {
        //Per què no funciona el següent codi?
        int[] a = new int[10]; //Part editada
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
        //No funciona perque no existeix el valor a[i], peque no está inicialitzada la variable.
        //Per el resultat, he inicialitzat la variable i ja funciona
    }

}
