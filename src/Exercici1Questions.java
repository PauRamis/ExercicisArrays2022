import java.util.Arrays;

public class Exercici1Questions {
    public static void main(String[] args) {
        /*
● Alguns programes empren «int a[]» enlloc de «int[] a», quina és la diferència?.
        És nomes una diferencia sintactica per als programadors de C,
        que estaven acostumats a utilitzar "int a[]".
        Funcionen igual.

● Per què els índexs en els arrays comencen en 0 i no en 1?
        Perque el primer valor de la memoria de l'ordinador es el 0

● Què passa si emprem un número negatiu per indexar un array?
        No funciona ja que l'ordinador no pot enmagatzemar res en nombres negatius de memoria.
                int[] arr = new int[-5];
                "Exception in thread "main" java.lang.NegativeArraySizeException: -5"

● Si «a[]» és un array, per què quan executem «System.out.println(a)» surt un número en
hexadecimal, com @f432321?
                Perque no identifica que vols imprimir el contingut de l'array.
                Has d'usar Arrays.toString().
                EX: System.out.println(Arrays.toString(a));


● Si creem un array d'enters de 100 posicions, quin valor tindrà cada element, inicialment?
                Cada element tindrá el valor 0.
*/
    }

}