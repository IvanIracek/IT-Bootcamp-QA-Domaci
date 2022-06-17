import java.util.Arrays;

public class CWprvi {
    //https://www.codewars.com/kata/5effa412233ac3002a9e471d/java
    public static int add(int num1,int num2){
        String broj1;
        String broj2;
        String rezultat = "";
        int duzinaBroj1 = String.valueOf(num1).length();
        int duzinaBroj2 = String.valueOf(num2).length();
        if (duzinaBroj1 > duzinaBroj2){
            broj1 =  String.valueOf(num1);
            broj2 = "0".repeat(duzinaBroj1 - duzinaBroj2).concat(String.valueOf(num2));
        }
        else  if (duzinaBroj1 < duzinaBroj2){
            broj2 =  String.valueOf(num2);
            broj1 = "0".repeat(duzinaBroj2 - duzinaBroj1).concat(String.valueOf(num1));
        }
        else {
            broj1 =  String.valueOf(num1);
            broj2 =  String.valueOf(num2);
        }


        for (int i = 0; i < broj1.length(); i++) {
            int x = Integer.parseInt(String.valueOf(broj1.charAt(i)))
                    + Integer.parseInt(String.valueOf(broj2.charAt(i)));
            rezultat = rezultat.concat(Integer.toString(x));
        }

        return Integer.parseInt(rezultat);
    }
    public static void main(String[] args) {

    }
}
