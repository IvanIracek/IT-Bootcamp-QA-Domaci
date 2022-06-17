import java.util.Scanner;

public class Cetvrti_Pravougaonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int b = sc.nextInt();
        System.out.print("b: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++){
            System.out.println();
            for (int j = 1; j <= b; j++){
                System.out.print("#");
            }
        }
    }
}
