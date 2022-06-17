import java.util.Scanner;

public class Cetvrti {

public static boolean hasDuplicates (int[] x){
    for (int i = 0; i < x.length; i++) {
        for (int j = i + 1; j < x.length; j++) {
            if(x[i] == (x[j])){
                return true;
            }
        }
    }
    return false;
}
public static  int numberOfDuplicates (int[] x){
    int brojDup = 0;
    for (int i = 0; i < x.length; i++) {
        for (int j = i + 1; j < x.length; j++) {
            if(x[i] == (x[j])){
                brojDup++;
                break;
            }
        }
    }
    return brojDup;
}
    public static int [] stripDuplicates (int[]x){
        int pos = x.length;
        for (int i = 0; i < pos; i++) {
            for (int j = i + 1; j < pos; j++) {
                if (x[i] == x[j]) {
                    int q = j;
                    for (int k = j + 1; k < pos; k++, q++) {
                        x[q] = x[k];
                    }
                    pos--;
                    j--;
                }
            }
        }
        int [] y = new int[x.length - numberOfDuplicates(x)];
        for (int i = 0; i < y.length; i++) {
            y[i] = x[i];
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Unesite duzinu niza: ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println(hasDuplicates(x));
        System.out.println(numberOfDuplicates(x));
        for (int i = 0; i < x.length - numberOfDuplicates(x); i++) {
            System.out.print(stripDuplicates(x)[i]);
        }
    }
}
