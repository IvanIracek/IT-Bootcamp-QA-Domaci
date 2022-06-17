import java.util.Scanner;

public class Drugi {

    public static boolean tf (int godina){

        if ((godina % 4 == 0) && ((godina % 100 != 0) || (godina % 400 == 0))) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Unesite godinu: ");
            int godina = sc.nextInt();
            System.out.println(tf(godina));
        }
    }
}
