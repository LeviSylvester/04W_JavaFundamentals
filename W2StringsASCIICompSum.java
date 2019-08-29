import java.io.StringReader;

/*
2. Declarati si initializati 2 variabile de tip String.
Afisati care dintre acestea are suma valorilor caracterelor in codul ASCII mai mare
(ex: AAB mai mic decat zz -> "AAB" = 65+65+66 = 196, "zz" = 122+122 = 244  -> 196 < 244).
 */
public class W2StringsASCIICompSum {
    public static void main(String[] args) {
        //this doesn't to exactly what's asked:
//        String a = "A1";
//        String b = "A1";
//        if (a.compareTo(b)>0) {
//            System.out.println(a+" mai mare decat "+b);
//        } else if (a.compareTo(b)<0) {
//            System.out.println(b+" mai mare decat "+a);
//        } else {
//            System.out.println("sum of their characters' value are equal");
//        }

        //this does exactly what is asked:
        String firstString = "ABC";
        String secondString = "DEF";

        int length1 = firstString.length();
        System.out.println(length1);
        int charATi1;
        int charSum1 = 0;
        for (int i = 0; i < length1; i++) {
            charATi1 = firstString.charAt(i);
            charSum1 += charATi1;
        }

        int length2 = secondString.length();
        System.out.println(length2);
        int charATi2;
        int charSum2 = 0;
        for (int j = 0; j < length2; j++) {
            charATi2 = secondString.charAt(j);
            charSum2 += charATi2;
        }

        if (charSum1>charSum2) {
            System.out.println(firstString+" mai mare decat "+secondString);
        } else if (charSum2>charSum1) {
            System.out.println(charSum2+" mai mare decat "+charSum1);
        } else {
            System.out.println("sum of their characters' value are equal");
        }
    }
}