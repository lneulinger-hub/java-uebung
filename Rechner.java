public class Rechner {
    public static void main(String[] args) {
        int[] werte = {10, 20};
        int summe = 0;
        for (int i = 0; i < werte.length; i++) {
            summe = summe + werte[i];
    }
        System.out.println("Die Summe der Werte ist: " + summe);
    }
}
