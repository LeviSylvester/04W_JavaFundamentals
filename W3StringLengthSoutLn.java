/*
3. Declarati si initializati o variabila de tip String.
Afisati mesajul *-*-* de atatea ori
echivalent cu numarul de caractere al string-ului citit.
Mesajele se afiseaza pe cate o linie noua.
 */
public class W3StringLengthSoutLn {
    public static void main(String[] args) {
        String newString = "good morning";
        int strLength = newString.length();
        while (strLength > 0) {
            System.out.println("*-*-*");
            strLength--;
        }
    }
}
