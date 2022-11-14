public class Exercici13 {
    public static void main(String[] args) {
        //Escriu una funció que, donat un array d'enters, diu si hi ha algun element duplicat.
        int[] enters = {1, 2, 2, 3, 4, 5};
        boolean duplicats = TrobarDuplicats(enters);
        System.out.println(duplicats);
    }

    private static boolean TrobarDuplicats(int[] enters) {
        for (int i = 0; i < enters.length; i++) {
            for (int j = i+1; j < enters.length -1; j++) {
                if (enters[i] == enters[j])
                    return true;
            }
        }
        return false;
    }
}
