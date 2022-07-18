package Alteklausuren.Klausur_2022.Aufgabe_2;

public class TeilwortLöschen {

    public static void main(String[] args) {
        System.out.println(istTeilwortAnIndex("abcdef", "bcde", 1));
        System.out.println(findTeilWort("abcdeabf", "ab"));
        System.out.println(löscheTeilwort("abcdef", "cdef"));
        System.out.println(löscheAlleTeilworte("ababcf", new String[]{"abc", "bf"}));
    }

    static boolean istTeilwortAnIndex(String w, String v, int i) {
        if (v.length() <= w.length()) {
            for (int wPtr = i, vPtr = 0; vPtr < v.length(); wPtr++, vPtr++) {
                if (w.charAt(wPtr) != v.charAt(vPtr)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static boolean istTeilwortAnIndex2(String w, String v, int i) {
        if (v.length() <= w.length()) {
            for (int a = 0; a < v.length(); a++) {
                if (w.charAt(i + a) != v.charAt(a)) {
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    static int findTeilWort(String w, String v) {
        for (int i = 0; i < w.length(); i++) {
            if (istTeilwortAnIndex(w, v, i)) {
                return i;
            }
        }
        return -1;
    }

    static String löscheTeilwort(String w, String v) {
        int startIndexOfTeilWort = findTeilWort(w, v);
        if (startIndexOfTeilWort == -1) {
            return null;
        } else {
            String erg = "";
            int counter = 0;
            for (int i = 0; i < startIndexOfTeilWort; i++) {
                erg += w.charAt(i);
                counter++;
            }
            for (int i = counter + v.length(); i < w.length(); i++) {
                erg += w.charAt(i);
            }
            return erg;
        }
    }

    static String löscheAlleTeilworte(String w, String[] vArray) {
        String temp;
        for (int i = 0; i < vArray.length; i++) {
            if ((temp = löscheTeilwort(w, vArray[i])) != null) {
                w = temp;
            }
        }
        return w;
    }
}
