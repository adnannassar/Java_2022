package WrapperClasses;

import Algorithmen.ArrayTools;



public class Main {
    public static void main(String[] args) {
        String nr1 = "10";
        String nr2 = "20";
        int x = Integer.parseInt(nr1);
        int y = Integer.parseInt(nr2);

        System.out.println(nr1 + nr2);
        System.out.println(x + y);

        System.out.println("Max = " +  Integer.MAX_VALUE);
        System.out.println("Min = " +Integer.MIN_VALUE);


        String name = "Name Of The Course";
        System.out.println(name.length());

        System.out.println(name.equals("test"));

        System.out.println(name.substring(5,13));

        System.out.println(name.substring(12,name.length()));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String [] words = name.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

        System.out.println(name.charAt(8));
        System.out.println(name.indexOf('T'));
        System.out.println(name);

        for(int i = 0  ; i<name.length(); i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        ArrayTools.print1dArray(name.toCharArray());

        System.out.println(name.isEmpty());
        System.out.println(name.replace("The","***"));
        System.out.println(name);

    }
}
