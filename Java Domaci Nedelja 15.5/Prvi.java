import java.util.Scanner;

public class Prvi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            System.out.print("Upisite dan: ");
            int dan = sc.nextInt();
            sc.nextLine();
            System.out.print("Upisite mesec: ");
            String mesec = sc.nextLine();      //Radi za unete brojeve ili reci, npr: 11.1.2022 i 11.januar.2022
            mesec = mesec.trim();
            mesec = mesec.toLowerCase();
            String[] mesec1 = new String[13];
            System.out.print("Upisite godinu: ");
            int godina = sc.nextInt();

            mesec1[1] = "januar";
            mesec1[2] = "februar";
            mesec1[3] = "mart";
            mesec1[4] = "april";
            mesec1[5] = "maj";
            mesec1[6] = "jun";
            mesec1[7] = "jul";
            mesec1[8] = "avgust";
            mesec1[9] = "septembar";
            mesec1[10] = "oktobar";
            mesec1[11] = "novembar";
            mesec1[12] = "decembar";

            for (int i = 1; i <= 12; i++) {
                if (mesec.equals(mesec1[i])) {
                    String s = Integer.toString(i);
                    mesec = s;
                    break;
                }
            }
            int mesec2 = Integer.parseInt(mesec);

            int res = dan;
            int[] x = new int[13];

            x[1] = 31;
            if ((godina % 4 == 0) && ((godina % 100 != 0) || (godina % 400 == 0))) {
                x[2] = 29;
            } else {
                x[2] = 28;
            }
            x[3] = 31;
            x[4] = 30;
            x[5] = 31;
            x[6] = 30;
            x[7] = 31;
            x[8] = 31;
            x[9] = 30;
            x[10] = 31;
            x[11] = 30;
            x[12] = 31;

            for (int i = mesec2 - 1; i >= 0; i--) {
                if (mesec2 == 1) {
                    res = dan;
                    break;
                } else {
                    res = res + x[i];
                }
            }
            System.out.println(dan + "."+mesec1[mesec2] + "." + godina + " je " + res + "-i dan u godini.");



        //Probao sam sa nizom od 365
             /*   String[] x = new String[365];
                int p = 0;
                for (int i = 0; i < 31; i++) {
                    String s = Integer.toString(1);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=31;

                for (int i = 0; i < 28; i++) {
                    String s = Integer.toString(2);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=28;
                for (int i = 0; i < 31; i++) {
                    String s = Integer.toString(3);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=31;
                for (int i = 0; i < 30; i++) {
                    String s = Integer.toString(4);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=30;
                for (int i = 0; i < 31; i++) {
                    String s = Integer.toString(5);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=31;
                for (int i = 0; i < 30; i++) {
                    String s = Integer.toString(6);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=30;
                for (int i = 0; i < 31; i++) {
                    String s = Integer.toString(7);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=31;
                for (int i = 0; i < 31; i++) {
                    String s = Integer.toString(8);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=31;
                for (int i = 0; i < 30; i++) {
                    String s = Integer.toString(9);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=30;
                for (int i = 0; i < 31; i++) {
                    String s = Integer.toString(10);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=31;
                for (int i = 0; i < 30; i++) {
                    String s = Integer.toString(11);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                p+=30;
                for (int i = 0; i < 31; i++) {
                    String s = Integer.toString(12);
                    String d = Integer.toString(i + 1);
                    x[p+i] = s + d;
                }
                String dan = sc.nextLine();
                String mesec = sc.nextLine();
                String zbir = mesec+dan;

                for (int i = 0; i < x.length; i++) {
                    if (x[i].equals(zbir)){
                        System.out.println(i+1);
                    }
                }

              */
    }
}




