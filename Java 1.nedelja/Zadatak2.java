import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Unesite redni broj dana: ");
        int dan = q.nextInt();

        if ( dan < 1 || dan > 7){
            System.out.println("Probaj opet");
        }
        else if ( dan == 6 || dan == 7){
            System.out.println("Vikend");
        }
        else {
            System.out.println("Nije vikend");
        }

    }
}
