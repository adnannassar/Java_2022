package Aufgabe_1;

public class CisarChifree {

    static String verschlüsseln(String klarText, int verschiebung) {
        String verschlüsselterText = "";
        char c;
        for (int i = 0; i < klarText.length(); i++) {
            c = klarText.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + ((c + verschiebung) - 'a') % 26);
            }
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + ((c + verschiebung) - 'A') % 26);
            }
            verschlüsselterText += c;
        }
        return verschlüsselterText;
    }

    static String entschlüsseln(String verschlüsselterText, int verschiebung) {
        String entschlüsselterText = "";
        char c;

        for (int i = 0; i < verschlüsselterText.length(); i++) {
            c = verschlüsselterText.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('z' - (('z' - c + verschiebung) % 26));
            }
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('Z' - (('Z' - c + verschiebung) % 26));
            }
            entschlüsselterText += c;
        }
        return entschlüsselterText;
    }

    static void entschlüsselnVersuche(String verschlüsselterText, int anzahlVersuche) {
        for (int i = 1; i <= anzahlVersuche; i++) {
            System.out.println(i+": "+entschlüsseln(verschlüsselterText, i));
        }
    }

    public static void main(String[] args) {
        /*
        String klarText = "ABC"; // verschiebung 3 --> DEF
        int verschiebungKey = 3;

        System.out.println("Before: Klar Text: " + klarText);
        String verschlüsselterText = verschlüsseln(klarText, verschiebungKey);
        System.out.println("After:  Klar Text: " + klarText + " --> " + verschlüsselterText);

        String entschlüsselterText = entschlüsseln(verschlüsselterText, verschiebungKey);
        System.out.println("Entschlüßeln: DEF --> " + entschlüsselterText);
         */
        String text = "Ltg lxgs Stjihrwtg Ujhhqpaa-Btxhitg?";

        entschlüsselnVersuche(text, 20);
        // System.out.println(entschlüsseln(text, 15));


    }
}
