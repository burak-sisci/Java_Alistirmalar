//Klavyeden girilen pozitif bir sayının çift ise ekrana “ÇİFT”, çift değilse “ÇİFT DEĞİLDİR” yazdıran program

import java.util.Scanner;

public class acta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("sayı gir: ");
        int sayi = scanner.nextInt();

        if(sayi %2 == 0) {
            System.out.println("sayı çift. ");
        }
        else {
            System.out.println("sayı çift değil. ");
        }

        scanner.close();
    }
}
