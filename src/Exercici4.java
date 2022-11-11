import java.util.Arrays;

public class Exercici4 {
    public static void main(String[] args) {
        //Escriu una funció que inverteixi un array. Alerta: no ha de tornar un array, ha d'invertir el que
        //li passem. Recordeu que tots els objectes (tipus no primitius) es passen PER REFERÈNCIA, no
        //per valor.
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotar(numeros)));
    }

    //A la funció rotar, cambiam cada numero per el numero a l'altre costat de l'array
    //Nomes s'executa la mitat de l'array, ja que sinó, tornaria a colocar els numeros com la primera vegada
    public static int[] rotar(int[] numeros) {
        for (int i = 0; i < numeros.length/2; i++) {
            int t = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = t;
        }
        return numeros;
    }
}
