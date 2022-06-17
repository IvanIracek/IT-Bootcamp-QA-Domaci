import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.print("Dobrodosli u pivnicu ITBC, koliko imate godina: ");
        int korisnik = q.nextInt();

        if (korisnik > 0 && korisnik < 18) {
            System.out.println("Za vas sok");
        } else if (korisnik >= 18) {
            System.out.println("Za vas imamo odlicno psenicno pivo!");
        }
        else {
            System.out.println("Probajte opet");
        }
    }
}
