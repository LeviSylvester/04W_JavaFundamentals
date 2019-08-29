/*
6. Declarati si initializati un numar de tip short.
Afisati numerele din 2 in 2 incepand de la valoarea citita pana la 200.
 */
public class W6ShortDispPrgrsWhileReach {
    public static void main(String[] args) {
        short shNr = 221;//short number
        short rfNr = 200;//reference number
        short prNr = 2;//progress number

        //some cases must be treated because absence of an error message IS an error
        //therefore reference number & progress number must be stored in variables

        //if i.e. 199 < 200 and 199 >= 200-2 or
        //if i.e. 201 > 200 and 201 <= 200+2 display close enough

        //if shNr < rfNr addition with prNr,
        //if shNr > rfNr subtraction with prNr,
        //else display =

        if
        (((shNr < rfNr) && (shNr >= rfNr - prNr)) || ((shNr > rfNr) && (shNr <= rfNr + prNr))) {
            System.out.println(shNr+ " is close enough to " + rfNr + " with " + prNr + " progression!");
        } else if (shNr != rfNr) {
            while (shNr < rfNr) {
                System.out.print(shNr + " ");
                shNr += prNr;
            }
            while (shNr > rfNr) {
                System.out.print(shNr + " ");
                shNr -= prNr;
            }
        } else {
            System.out.println("No progression to make, equals " + rfNr + "!");
        }
    }
}
