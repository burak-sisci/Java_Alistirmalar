//Klavyeden girilen pozitif bir sayının tek ise ekrana “TEK”, tek değilse “TEK DEĞİLDİR” yazdıran program

import java.util.Scanner;

public class acta3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı gir: ");
        int sayi1 = scanner.nextInt(); 

        if (sayi1 %2 == 0 && sayi1>0) {
            System.out.println("sayı çift. ");
        }
        else if (sayi1 %2 != 0 && sayi1>0) {
            System.out.println("sayı tek. ");
        }    
        else {
            System.out.println("sayı geçersiz. ");
        }
    scanner.close();
    }
}
