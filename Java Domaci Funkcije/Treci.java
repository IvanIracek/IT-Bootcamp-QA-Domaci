import java.util.Scanner;

public class Treci {
    public static String s (String rec,int n){
        String suma = "";
        for (int i = 0; i < n; i++) {
            suma += rec;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite rec: ");
        String rec = sc.nextLine();
        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();

        System.out.println(s(rec, broj));

    }
}
