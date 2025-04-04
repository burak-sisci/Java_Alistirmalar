/*Kuvvet hesaplayan bir program yazınız. Klavyeden girilen sayı ve istenilen kuvvetini hesaplayınız */


//Math.pow() ile yapılış

import java.util.Scanner;
public class acta19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sayıyı giriniz: "); 
        double sayi = scanner.nextInt();

        System.out.print("sayının kuvvetini giriniz: ");
        double  kuvvet = scanner.nextInt();

        double sonuc = 1;
        for (int i = 1;i<=kuvvet;i++) {
            sonuc = sonuc*sayi;
        }
        System.out.println((int)sayi+"^"+(int)kuvvet+" = "+(int)sonuc);

        scanner.close();
    }
}
