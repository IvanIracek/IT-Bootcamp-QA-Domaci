import java.util.Scanner;

public class Treci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Unesite broj: ");
         int n = sc.nextInt();
         int zbir = 0;

         while (n != 0){
             zbir = zbir + n;
             System.out.print("Zbir je: " + zbir + " ,Unesite sledeci broj ili 0 da izadjete iz programa: ");
             n = sc.nextInt();
         }
         if (n == 0){
             System.out.println();
             System.out.println("Ukupan zbir je: " +zbir);
         }

    }
}
