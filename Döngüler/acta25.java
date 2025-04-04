/*Klavyeden girilen 10 tane sayıdan negatiflerin sayısını, 
pozitiflerin toplamını bulan ve her ikisini de ekrana yazan programın kodlarını yazınız */

import java.util.Scanner;
public class acta25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi = 0;
        int negatifSayaci = 0;
        int pozitifToplam = 0;
        for(int i =1;i<=10;i++) {
            System.out.print(i+". sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if(sayi<0) negatifSayaci++;
            else if(sayi>0) pozitifToplam += sayi;
        }
        System.out.println("pozitif sayıların toplamı: "+pozitifToplam);
        System.out.println("negatif sayıların adedi: "+negatifSayaci);

        scanner.close();
    }
}
