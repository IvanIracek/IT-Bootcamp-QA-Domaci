import java.util.Scanner;

public class PrviSaPrveListe {
    public static double max (double x, double y, double z) {
        if(x > y && x > z){
            return x;
        }
        else if(y > z){
            return y;
        }
        else{
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++) {
            System.out.print("Unesite prvi broj: ");
            double x = sc.nextDouble();
            System.out.print("Unesite drugi broj: ");
            double y = sc.nextDouble();
            System.out.print("Unesite treci broj: ");
            double z = sc.nextDouble();

            System.out.println("Najveci je: "+max(x, y, z));
        }
    }

}
