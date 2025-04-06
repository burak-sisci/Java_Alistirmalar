/*Bir oyun tasarlanması istenmektedir. Oyunun kuralları aşağıdaki gibidir:
1. Oyun başladığında 1-9 arasında rastgele bir sayı tutulacak, ekrana yazdıracak ve bu sayı kullanıcının kasa değeri olacak,
2. Sonra kullanıcıya “Kaç sefer daha sayı tutayım?” şeklinde bir soru sorulacak,
3. Kullanıcı bunun cevabını klavyeden girecek,
4. Kullanıcının girdiği sefer/adet kadar bilgisayar 1-9 arasında rastgele sayı tutacak, 
    tuttuğu sayıları ekrana yazdıracak ve her tuttuğu sayıyı kullanıcının kasa değerine ekleyecektir,
5. Sayı tutma işlemi bitince kasa değeri ekrana yazdırılacak,
6. Eğer kullanıcının kasa değeri 35-40 arasında ise “Tebrikler, kazandınız.” mesajı yazdırılacak, 
    bunların dışındaki değerler için “Üzgünüm, kaybettiniz.” Mesajı yazdırılacaktır.
Bu işlemleri gerçekleştiren kodları yazınız. */

import java.util.Scanner;
import java.util.Random;
public class cikmis_soru1 {
    public static void main(String[] args) {
        int toplamDeger = 0, rastgeleSayi;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        rastgeleSayi = (random.nextInt(9))+1;

        System.out.println("tutulan sayı: "+rastgeleSayi);
        toplamDeger+=rastgeleSayi;

        System.out.print("kaç sefer daha sayı tutayım: ");
        int sefer = scanner.nextInt();
        for (int i = 1; i <= sefer; i++) {
            rastgeleSayi = (random.nextInt(9))+1;
            System.out.println(rastgeleSayi);
            toplamDeger+=rastgeleSayi;

        }
        if(35<=toplamDeger && toplamDeger<=40) 
            System.out.println("tebrikler, kazandınız. ");
        else 
            System.out.println("üzgünüm kaybettiniz. ");
        System.out.println(toplamDeger);
        scanner.close();
    }
}
