/*
5. Declarati si initializati o variabila de tip int.
Utilizand while, afisati ultima cifra a numarului initial,
atat timp cat, utima cifra a numarului
care urmeaza sa fie trunchiat rand pe rand este divizibila cu 3.
( ex: 235693 - afisam 333   ->3,9,6 divizibile cu 3)
 */
public class W5IntLastDigDispWhileDiv {
    public static void main(String[] args) {
        int initNum = 235693;/*it has to remain constant, because <-this specific number's
        last digit has to be displayed every time while expr in while loop is true:*/
        int lastDig = initNum % 10;

        //initialized with initial number, truncated with 1 digit from R to L every loop:
        int numTrunc = initNum;

        //last digit of the number to be truncated, updated with every loop:
        int lastDigTrunc = numTrunc % 10;

        //main logic of the solution:
        while (lastDigTrunc % 3 == 0) {//while last dig of the nr to be trunc is div by 3
            System.out.print(lastDig);//display side by side the initial nr's last digit
            numTrunc /= 10;//number is truncated with one digit from R to L
            lastDigTrunc = numTrunc % 10;//last digit of the truncated number is updated
        }
    }
}
