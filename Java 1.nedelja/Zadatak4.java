import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Unesite mesec (1-12): ");
        int mesec = q.nextInt();

        if ( mesec <1 || mesec > 12){
            System.out.println("Probaj opet");
        }
        else {
            if (mesec == 2) {
                System.out.println("Upisite godinu: ");
                int godina = q.nextInt();
                if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
            } else if (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) {
                System.out.println("30");
            } else {
                System.out.println("31");
            }
        }


    }
}