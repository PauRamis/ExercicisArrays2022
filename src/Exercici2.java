public class Exercici2 {
    public static void main(String[] args) {
        //Escriu un programa que declara i inicialitza un array a[] de 1000 elements, i intenta accedir a
        //l'element 1000. El programa compila? Funciona correctament?
        int[] a = new int[1000];
        System.out.println(a[999]);

        //El programa no compilaria si poses "System.out.println(a[1000])",
        // ja que el 999, es realement l'element numero 1000, perque comença a contar desde el 0.
        //"Index 1000 out of bounds for length 1000"
    }
}
