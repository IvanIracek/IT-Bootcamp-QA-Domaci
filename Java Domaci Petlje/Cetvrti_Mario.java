import java.util.Scanner;

public class Cetvrti_Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite visinu: ");
        int n = sc.nextInt();
        String t = "#";
        String s = " ";

        for (int i = 1; i <= n; i++){
            String b = s.repeat(n-i) + t.repeat(i) + s + t.repeat(i);
            System.out.print(b);
            System.out.println();
            }
        }
    }

