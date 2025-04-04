/*Kuvvet hesaplayan bir program yazınız. Klavyeden girilen sayı ve istenilen kuvvetini hesaplayınız */

//Math.pow() ile yapılış

import java.util.Scanner;
public class acta18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sayıyı giriniz: "); 
        double sayi = scanner.nextInt();

        System.out.print("sayının kuvvetini giriniz: ");
        double kuvvet = scanner.nextInt();

        double sonuc = Math.pow(sayi,kuvvet);
        
        System.out.println((int)sayi+"^"+(int)kuvvet+" = "+(int)sonuc);

        scanner.close();
    }
}
