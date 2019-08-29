package W7OOPCopilMain;
/*
7. OOP - Creati o clasa Child care sa contina numele acestuia, varsta si numarul de jucarii.
Implementati metodele "bunaZiua", in care sa afiseze mesajul "Buna Ziua",
metoda "salut", care primeste ca parametru un nume (de exemplu, Daniel)
si va afisa "Salut, Daniel",
precum si o metoda in care acesta poate primi o noua jucarie (o data sau de mai multe ori)
in care sa actualizati numarul curent de jucarii.
Creati o clasa Main in care sa demonstrati functionalitatile create.
 */
public class Main {
    public static void main(String[] args) {
//        String nume = "Levi";
//        byte varstaCopil = 3;
//        long nrJucarii = 999_999_999_999L;
//        functionalitati(nume, varstaCopil, nrJucarii);
//    }
//    private static void functionalitati(String nume, byte varstaCopil, long nrJucarii) {

        Copil levi = new Copil();
        levi.bunaZiua();
        levi.salut("Geli");
        levi.primescJuc(2);
    }
}
