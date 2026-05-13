public class Main {

    // Calcule la moyenne de deux notes
    public static double moyenne(double note1, double note2) {
           return (note1 + note2) / 2;
    }

    // Retourne la meilleure note
    public static double meilleureNote(double note1, double note2) {
        return 0; // À compléter
    }

    /*
     * Affiche les informations du binôme
     * Attention : chacun ajoute sa ligne
     */
    public static void infosBinome() {
        // System.out.println("Nom Prénom 1");
        // System.out.println("Nom Prénom 2");
    }

    public static void main(String[] args) {

        double note1 = 12.5;
        double note2 = 15.0;

        System.out.println("La moyenne est : " + moyenne(note1, note2));
        System.out.println("La meilleure note est : " + meilleureNote(note1, note2));

        infosBinome();
    }
}