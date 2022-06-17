import java.util.Scanner;

public class Dodatni1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
        int n = sc.nextInt();

        while (n < 2) {
            System.out.println("Unesite niz veci 1");
            n = sc.nextInt();
        }
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite "+(i+1)+" broj: ");
            x[i] = sc.nextInt();
        }
        for (int i = 0; (i) < n; (i)++) {
            System.out.print(x[i]+",");
        }
        int q;
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++){
                if(x[i] > x[j]){
                    q = x[i];
                    x[i] = x[j];
                    x[j] = q;
                }
            }
        }
        System.out.println();
        System.out.println("Drugi najveci je: "+ x[x.length - 2]);
        System.out.println("Drugi najmanji je: "+x[1]);
    }
}