//Klavyeden girilen bir sayının pozitif, negatif veya sıfıra eşit olduğunu ekrana yazdıran program

import java.util.Scanner;;

public class acta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Bir sayı gir: ");
        int sayi = scanner.nextInt(); 

        if (sayi<0) {
            System.out.println("sayı sıfırdan küçük ");
        }
        else if (sayi>0) {
            System.out.println("sayı sıfırdan büyük ");
        }
        else if (sayi==0) {
            System.out.println("sayı sıfıra eşit ");
        }
        else {
            System.out.println("geçersiz sayı ");
        }
        scanner.close();
    }
}