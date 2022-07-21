package Alteklausuren.Klausur_2021.Aufgabe_2;

public class ZeichenWiederholung {
    public static void main(String[] args) {
        System.out.println(wiederhole("abc", 3));
        System.out.println(berechnePräfix("abac", 2));
        System.out.println(istWiederholt("abab"));
        System.out.println(istMehrfachWiederholt("aba"));
    }

    static String wiederhole(String w, int n) {
        String erg = "";
        for (int i = 0; i < n; i++) {
            erg += w;
        }
        return erg;
    }

    static String berechnePräfix(String w, int i) {
        String erg = "";
        for (int j = 0; j < i; j++) {
            erg += w.charAt(j);
        }
        return erg;
    }

    static boolean istWiederholt(String w) {
        if (w.length() % 2 == 0) {
            String strLeft = "";
            String strRight = "";
            for (int i = 0; i < w.length() / 2; i++) {
                strLeft += w.charAt(i);
            }
            for (int i = w.length() / 2; i < w.length(); i++) {
                strRight += w.charAt(i);
            }
            return strLeft.equals(strRight);
        } else {
            return false;
        }
    }

    static boolean istMehrfachWiederholt(String w) {
        String word = "";
        word += w.charAt(0);
        for (int i = 1; i < w.length(); i++) {
            if (w.charAt(i) != w.charAt(0)) {
                word += w.charAt(i);
            } else {
                break;
            }
        }
        return w.length() > word.length() && w.length() % word.length() == 0;
    }
}
