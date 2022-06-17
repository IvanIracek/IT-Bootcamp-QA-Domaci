package Drugi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean q = true;
        List<Double> ocene = new ArrayList<>();
        String s = "";
        while(q){
            System.out.println("Unesite ocenu: ");
            ocene.add(sc.nextDouble());
            System.out.println("Da li ste gotovi? Y/N");
            s = sc.next();
            if(s.equalsIgnoreCase("y")){
                q = false;
            }
        }


        Student mitar = new Student("Mitar", "Mitrovic", "Geologija", ocene);
        mitar.prolaznost();
    }
}
