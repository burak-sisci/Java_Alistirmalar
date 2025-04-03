/*Yaz okulu ücretlerini hesaplayan bir programın yazılması istenmektedir. 
Öncelikle kullanıcı dersi hangi fakülteden alacak onun bilgisi girilmelidir. 
Teknoloji Fakültesi için TF, Mühendislik Fakültesi için MF, Eğitim Fakültesi için EF bilgisi girilmektedir. 
Öğrenciye daha sonra hangi dersi alacağı sorulacaktır. 
Öğrencinin Fizik 1 için FİZ1, Fizik 2 için FİZ2, Kalkülüs 1 için KLK1 ve Kalkülüs 2 için KLK2 bilgisi girişi yapmaktadır. 
Öğrenci sadece fakülte seçimi ve 1 ders seçimi yapacaktır. 
Eğer dersi Teknoloji Fakültesinden alıyorsa ders saati başına 20TL, 
eğer dersi Mühendislik Fakültesinden alıyorsa ders saati başına 22TL, 
eğer dersi Eğitim Fakültesinden alıyorsa ders saati başına 19TL ödemesi gerekiyor. 

Fizik 1 ve Fizik 2 derslerinin ders saati 3, 
Kalkülüs 1 ve Kalkülüs 2 derslerinin ders saati 4 tür.

Klavyeden fakülte ve ders bilgisi girildikten sonra 
ödemesi gereken yaz okulu ücretini ekrana yazdıran programın kodlarını yazınız */

import java.util.Scanner;

public class acta10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ders hangi fakülteden alınacak (TF,MF,EF): ");
        String fakulte = scanner.nextLine();

        System.out.print("öğrenci hangi dersi alacak (FİZ1,FİZ2,KLK1,KLK2): ");
        String dersAdi = scanner.nextLine();

        int dersUcreti = 1;

        if (fakulte.equalsIgnoreCase("MF")) {
            dersUcreti = 22;
        }
        else if (fakulte.equalsIgnoreCase("EF")) {
            dersUcreti = 19;
        }
        else if (fakulte.equalsIgnoreCase("MF")) {
            dersUcreti = 20;
        }

        int dersSaati = 1;

        if (dersAdi.equalsIgnoreCase("FİZ1")) {
            dersSaati = 3;

        }
        else if (dersAdi.equalsIgnoreCase("FİZ2")) {
            dersSaati = 3;

        }
        else if (dersAdi.equalsIgnoreCase("KLK1")) {
            dersSaati = 4;

        }
        else if (dersAdi.equalsIgnoreCase("KLK2")) {
            dersSaati = 4;

        }

        int toplamUcret = dersSaati*dersUcreti;
        System.out.println("fakülte: "+fakulte);
        System.out.println("ders: "+dersAdi);
        System.out.println("ücret: "+toplamUcret);

        scanner.close();
    }
}
