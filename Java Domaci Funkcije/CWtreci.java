public class CWtreci {
    //https://www.codewars.com/kata/52fba66badcd10859f00097e/java
    public static String disemvowel(String str) {
        StringBuilder sb = new StringBuilder(str);
        int q = sb.length();
        for (int i = 0; i < q; i++) {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'A' || sb.charAt(i) == 'e' || sb.charAt(i) == 'E' || sb.charAt(i) == 'i' || sb.charAt(i) == 'I' || sb.charAt(i) == 'o' || sb.charAt(i) == 'O' || sb.charAt(i) == 'u' || sb.charAt(i) == 'U'){
                sb.deleteCharAt(i);
                q--;
                i--;
            }
        }
        String s = sb.toString();
        return s;

    }
    public static void main(String[] args) {
    }
}
