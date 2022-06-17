import java.util.Locale;
import java.util.Scanner;

public class CWcetvrti {
//https://www.codewars.com/kata/55908aad6620c066bc00002a/java
    public static boolean getXO (String str) {
        str = str.toLowerCase();

        char x = 'x';
        char o = 'o';

        int cx = 0;
        int co = 0;

        for(int i = 0; i < str.length(); i++) {
               if(str.charAt(i) == 'x'){
                   cx++;
               }
               if(str.charAt(i) == 'o'){
                   co++;
               }
        }
        if(cx == co || (cx == 0 && co == 0)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
