/*Klavyeden girilen sayı pozitif olduğu sürece sayının faktöriyelini hesaplayan ve 
sayı negatif olduğunda programı sonlandıran kodları yazınız */

import java.util.Scanner;

public class acta29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
            int sayi = scanner.nextInt();
            
            // Negatif sayı girişi kontrolü
            if (sayi < 0) {
                System.out.println("Negatif sayı girdiniz. Program sonlanıyor.");
                break;  // Negatif sayı girildiğinde döngü sonlanır
            }
            
            System.out.println("Faktoriyel: " + Faktoriyel(sayi));
        } while (true);  // Sonsuz döngü

        scanner.close();
    }

    public static int Faktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;  // Faktöriyel hesaplama
        }
        return sonuc;
    }
}
