package W7OOPCopilMain;

/*
7. OOP - Creati o clasa Copil care sa contina numele acestuia, varsta si numarul de jucarii.
Implementati metodele "bunaZiua", in care sa afiseze mesajul "Buna Ziua",
metoda "salut", care primeste ca parametru un nume (de exemplu, Daniel)
si va afisa "Salut, Daniel",
precum si o metoda in care acesta poate primi o noua jucarie (o data sau de mai multe ori)
in care sa actualizati numarul curent de jucarii.
Creati o clasa Main in care sa demonstrati functionalitatile create.
 */
public class Copil {
    static String nume = "Levi";
    static byte varstaCopil = 3;
    static long nrJucarii = 999_999_999_999L;

    void bunaZiua() {
        System.out.println("Buna Ziua");
    }

    void salut(String tu) {
        System.out.println("Salut, " + tu);
    }

    void primescJuc(long cadou) {
        nrJucarii += cadou;
        System.out.println("Multumesc, am acum " + nrJucarii + " de jucarii! :D");
    }
}
