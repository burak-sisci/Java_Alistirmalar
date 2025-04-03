/*Klavyeden girilen 2 sayıyı toplayıp sonucunu ekrana yazdıktan sonra, 
kullanıcıya “Tekrar Hesaplama Yapmak İstiyormusunuz?” diye soru sorup, 
eğer kullanıcı “e” tuşuna basarsa yeniden işlemleri gerçekleştiren program */

import java.util.Scanner;
public class acta16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char tekrar = 'e';
        do {
            System.out.println("sayı gir: "); 
            int sayi1 = scanner.nextInt();
    
            System.out.println("bir sayı daha gir: ");
            int sayi2 = scanner.nextInt();
            int toplam = 0;

            toplam = sayi1 + sayi2;
            System.out.println("toplam: "+toplam);

            System.out.println("tekrar hesaplama yapmak istiyor musun? (e/h) ");
            tekrar = scanner.next().charAt(0); 
        } while (tekrar == 'e');
        scanner.close();
    }
}
