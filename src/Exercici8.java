import java.util.Arrays;

public class Exercici8 {
    public static void main(String[] args) {
        //Escriu una funció que retorna una còpia d'un array bidimensional d'enters, que li passem
        //com a paràmetre.

        int[][] ar = {{12, 5}, {2, 4}, {3, 6}};

        int[][] array2 = Arrays.copyOf(ar, ar.length);

        //Usam deepToString pels arrays bidimensionals
        System.out.println(Arrays.deepToString(array2));
    }
}
