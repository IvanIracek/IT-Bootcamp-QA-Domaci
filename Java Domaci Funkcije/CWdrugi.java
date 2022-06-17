public class CWdrugi {
    //https://www.codewars.com/kata/554b4ac871d6813a03000035/java
    public static String highAndLow(String numbers) {
        String []s = numbers.split(" ");
        int [] broj = new int[s.length];

        for (int i = 0; i < broj.length; i++) {
            broj[i] = Integer.valueOf(s[i]);
        }
        int t = 0;
        for (int i = 0; i < broj.length; i++) {
            for (int j = i + 1; j < broj.length; j++) {
                if(broj[i] > broj[j]){
                    t = broj[j];
                    broj[j] = broj[i];
                    broj[i] = t;
                }
            }
        }
        String hl = Integer.toString(broj[broj.length - 1]) + " " + Integer.toString(broj[0]);
        return hl;
    }

    public static void main(String[] args) {

    }
}
