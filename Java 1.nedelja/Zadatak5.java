import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Unesite trocifren broj: ");
        String broj = q.next();

        int a = Character.getNumericValue(broj.charAt(0)) ;
        int b = Character.getNumericValue(broj.charAt(1)) ;
        int c = Character.getNumericValue(broj.charAt(2)) ;

        int ar =(int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3);

        System.out.println("Cifra stotine je: "+a);
        System.out.println("Cifra desetice je: "+b);
        System.out.println("Cifra jedinice je: "+c);

        if (Integer.parseInt(broj) == ar){
            System.out.println("Broj jeste Armstrongov");
        }
        else {
            System.out.println("Nije Armstrongov");
        }
        //resenje pitalice: 7
    }
}
