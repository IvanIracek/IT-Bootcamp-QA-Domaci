import java.util.Scanner;

public class Drugi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n <= 0){
            System.out.println("Unesite pozitivan broj");
            n = sc.nextInt();
        }
        int[] x = new int[n + 1];

        x[0] = 0;
        x[1] = 1;

        for (int i = 2; i < n; i++){
            x[i] = x[i - 1] + x[i - 2];
        }
        String s ="";
        for (int i = 0; i < n; i++) {

             s = s+ x[i] + ",";
        }
            System.out.print(s.substring(0, s.length() - 1));
    }
}


