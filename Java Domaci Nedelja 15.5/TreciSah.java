import java.util.Locale;
import java.util.Scanner;

public class TreciSah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //uraditi sa hash maps

        int[] z = new int [4];

        z[0] = 1;
        z[1] = 3;
        z[2] = 5;
        z[3] = 12;

        System.out.println("Prvi igrac: Unesite broj figura: ");
        int broj1 = sc.nextInt();
        sc.nextLine();

        String[] x = new String[broj1];

        for(int i = 0; i < broj1; i++){
            System.out.println("Unesite"+" "+(i+1)+" -u figuru: ");
            String figure1 = sc.nextLine();
            figure1=figure1.toLowerCase();
            figure1=figure1.trim();
            if(figure1.equals("pesak")||figure1.equals("konj")||figure1.equals("lovac")||figure1.equals("top")||figure1.equals("kraljica")) {
                x[i] = figure1;
            }
            else {
                System.out.println("Unesite opet: ");
                i--;
            }
        }
        System.out.println("Igrac 2: Unesite broj figura: ");
        int broj2 = sc.nextInt();
        sc.nextLine();

        String[] y = new String[broj2];

        for (int i = 0; i < broj2; i++) {
            System.out.println("Unesite"+" "+(i+1)+" -u figuru: ");
            String figure2 = sc.nextLine();
            figure2=figure2.toLowerCase();
            figure2=figure2.trim();
            if(figure2.equals("pesak")||figure2.equals("konj")||figure2.equals("lovac")||figure2.equals("top")||figure2.equals("kraljica")) {
                y[i] = figure2;
            }
            else{
                System.out.println("Unesite opet: ");
                i--;
            }
        }
        int zbir1 = 0;
        int zbir2 = 0;
        for (int i = 0; i < broj1; i++) {
            switch (x[i]){
                case "lovac": case "konj":
                    zbir1 += z[1];
                    break;
                case "pesak":
                    zbir1 +=  z[0];
                    break;
                case "top":
                    zbir1 +=  z[2];
                    break;
                case "kraljica":
                    zbir1 +=  z[3];
                    break;
            }
        }
        for (int i = 0; i < broj2; i++) {
            switch (y[i]){
                case "lovac": case "konj":
                    zbir2 += z[1];
                    break;
                case "pesak":
                    zbir2 +=  z[0];
                    break;
                case "top":
                    zbir2 +=  z[2];
                    break;
                case "kraljica":
                    zbir2 +=  z[3];
                    break;
            }
        }
        System.out.println(zbir1);
        System.out.println(zbir2);
        if(zbir1 > zbir2){
            System.out.println("Pobednik je igrac1");
        } else if (zbir1 < zbir2) {
            System.out.println("Pobednik je igrac 2");
        }
        else {
            System.out.println("Nereseno");
        }
    }
}
