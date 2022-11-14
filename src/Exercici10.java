public class Exercici10 {
    public static void main(String[] args) {
        //Escriu una funció que calculi una mitja ponderada. El primer paràmetre són les notes, en
        //forma d'array d'enters, i el segon paràmetre són els «pesos», en forma d'array de doubles. El
        //resultat ha d'ésser un double.
        double[] notes = {5, 7, 3, 1};
        double[] pesos = {0.25, 0.30, 0.20, 0.25};

        double notaFinal = calculaNota(notes, pesos);
        System.out.println(notaFinal);


    }

    private static double calculaNota(double[] notes, double[] pesos) {
        if (notes.length != pesos.length)
            throw new RuntimeException("Els arrays de notes i pesos no son iguals");

        double sumaPesos = 0;
        double suma = 0;

        for (int i = 0; i < notes.length; i++) {
            sumaPesos += pesos[i];
            suma = suma + notes[i] * pesos[i];
        }

        if (sumaPesos != 1){
            throw new RuntimeException("Els pesos no sumen 1");
        }
        return suma;
    }
}
