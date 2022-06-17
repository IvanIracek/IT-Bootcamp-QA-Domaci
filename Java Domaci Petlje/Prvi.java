import java.util.Scanner;

public class Prvi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prirodni broj: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
