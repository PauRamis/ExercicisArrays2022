public class Exercici3 {
    public static void main(String[] args) {
        //Escriu una funció que accepti dos vectors de longitud 2 (dos arrays) i computi la distància
        //euclidiana entre ells (l'arrel quadrada de la suma del quadrat de les diferències entre els
        //elements).
        int[] p1 = {5, 7};
        int[] p2 = {6, 8};

        calcDistancia(p1, p2);
    }

    private static void calcDistancia(int[] p1, int[] p2) {
        double distancia = Math.sqrt((p2[1] - p2[0]) * (p2[1] - p2[0]) + (p1[1] - p1[0]) * (p1[1] - p1[0]));
        System.out.println("Distancia entre els dos punts: " + distancia);
    }
}
