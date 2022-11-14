import java.util.Arrays;

public class Exercici11 {
    public static void main(String[] args) {

        int[] ar = {5, 7, 2, 9, 10, 1, -7};
        bubbleSort2(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubbleSort2(int[] ar) {
        for (int j = 0; j < ar.length/2; j++) {

            //Cap a la Dreta
            for (int i = j; i < ar.length - 1 - j; i++) {
                if (ar[i] > ar[i + 1]) {
                    int t = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = t;
                }
            }

            //Cap a la esquerra
            for (int i = ar.length - 2 - j; i > j; i--) {
                if (ar[i] < ar[i - 1]) {
                    int t = ar[i];
                    ar[i] = ar[i - 1];
                    ar[i - 1] = t;
                }
            }
        }
    }
}
