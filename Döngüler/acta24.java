/*Bir sayı tahmin oyunu yazınız. 
Oyunda ilke olarak bilgisayar 1-100 arasında bir sayı tutacak
 ve kullanıcıya bir mesaj ile “Bir Sayı tuttum, 
 haydi bil bakalım:)” diye mesaj verecek. Kullanıcı sayı tahmininde bulunacak. 
 Bilgisayar kullanıcıyı Yukarı, Aşağı veya Tebrikler Bildiniz diye mesajla uyaracak. 
Bu kodları yazınız. */

//Random Sınıfı ile

import java.util.Scanner;
import java.util.Random;
public class acta24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int rastgeleSayi = rand.nextInt(100)+1;
        int kullaniciSayisi = 0;
        System.out.println("bir sayı tuttum. hadi bil bakalım. ");

        do{
            System.out.print("tahmin ettiğin sayı: ");
            kullaniciSayisi = scanner.nextInt();
            if(kullaniciSayisi<rastgeleSayi) System.out.println("daha büyük bir sayı olmalı. ");
            else if(kullaniciSayisi>rastgeleSayi) System.out.println("daha küçük bir sayı olmalı. ");
            else if(kullaniciSayisi==rastgeleSayi) System.out.println("Tebrikler Bildiniz. ");
        }while(kullaniciSayisi!=rastgeleSayi);
        scanner.close();

    }
}
