/*Bir sayı tahmin oyunu yazınız. 
Oyunda ilke olarak bilgisayar 1-100 arasında bir sayı tutacak
 ve kullanıcıya bir mesaj ile “Bir Sayı tuttum, 
 haydi bil bakalım:)” diye mesaj verecek. Kullanıcı sayı tahmininde bulunacak. 
 Bilgisayar kullanıcıyı Yukarı, Aşağı veya Tebrikler Bildiniz diye mesajla uyaracak. 
Bu kodları yazınız. */

//Math.random() ile
import java.util.Scanner; 
public class acta23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rastgeleSayi = (int)(Math.random()*(100))+1;
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
