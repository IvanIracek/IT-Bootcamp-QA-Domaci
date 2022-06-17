import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Unesite godinu: ");
        int godina = q.nextInt();


        if (godina<1){
            System.out.println("Probaj opet");
        }
        else if ( godina % 4 == 0 && ( godina % 400 == 0 || godina % 100 != 0 )){
            System.out.println("Godina je prestupna");
        }
        else{
            System.out.println("Godina nije prestupna");
        }
    }
}