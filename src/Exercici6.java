public class Exercici6 {
    public static void main(String[] args) {
        //Escriu un codi que, donat un array de booleans bidimensional, imprimeixi una taula on hi
        //hagi el caràcter «*» si és true i un espai si és false, per cada element. Aprofiteu per dibuixar una
        //creu, d’aquesta manera:

        boolean[][] a = new boolean[5][5];
        posarCreu(a);
    }

    private static void posarCreu(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == 2 || j == 2){
                    a[i][j] = true;
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
