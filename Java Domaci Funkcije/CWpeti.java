import java.util.Scanner;

public class CWpeti {
//https://www.codewars.com/kata/550e9fd127c656709400024d/java
    public static long cubeSum(int n, int m) {
        long sum = 0;
        if (n > m) {
            for (long i = m + 1; i <= n; i++) {
                sum += Math.pow(i, 3);
            }
            return sum;
        }
        sum = 0;
        if (m > n) {
            for (long i = n + 1; i <= m; i++) {
                sum += Math.pow(i, 3);
            }
            return sum;
        }
        return 0;

    }

        public static void main (String[]args){

        }
    }


