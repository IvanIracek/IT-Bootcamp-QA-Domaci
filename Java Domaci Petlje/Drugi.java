import java.util.Scanner;

public class Drugi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int n = sc.nextInt();
        System.out.print("Unesite drugi broj: ");
        int m = sc.nextInt();
        int sum = 0;

        if (n < m) {
            for (int i = n; i <= m; i++) {
                sum = sum += i;
            }
            System.out.println(sum);
        }
        else if (n > m) {
            for (int i = m; i <= n; i++){
                sum = sum += i;
            }
            System.out.println(sum);

        }
    }
}
