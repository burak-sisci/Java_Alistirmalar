//Klavyeden girilen pozitif sayının 7’ e tam bölünüp bölünmediğini bulan ve sonucu ekrana yazdıran program 

import java.util.Scanner;

public class acta5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("sayı gir. ");
        int sayi = scanner.nextInt(); 

        if (sayi %7 == 0) {
            System.out.println("sayı 7 ye tam bölünür. ");
        }
        else if (sayi %7 != 0) {
            System.out.println("sayı 7 ye tam bölünmez. ");
        }
    
        scanner.close();
    }
}
