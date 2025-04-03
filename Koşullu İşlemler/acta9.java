/*Bir öğrencinin bir dersten aldığı başarı notunun hesaplanması şu şekilde olacaktır,
a.
Öğrenci 3 adet Kısa sınav, 2 adet Vize sınavına ve 1 adet Final sınavına girmektedir.
b.
Kısa sınav notları ve vize notları klavyeden girilerek bu notların aritmetik ortalamaları alınacaktır,
c.
Son olarak final notu girilerek, başarı puanı hesaplanıp ekrana yazılacaktır.
d.
Başarı puanı şu şekilde hesaplanmaktadır : BP = (KSort * 50/100 +Vort * 50 / 100 ) * 40/100 + F * 60/100;
Not : BP : Başarı puanı, KSort :Kısa sınavların not ortalaması, Vort :Vizelerin not ortalaması, F: Final Notu
Bu işlemi yapan programın kodlarını yazınız. */

import java.util.Scanner;

public class acta9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
    
        System.out.print("kısa sınav 1: ");
        int ks1 = scanner.nextInt();

        System.out.print("kısa sınav 2: ");
        int ks2 = scanner.nextInt();

        System.out.print("kısa sınav 3: ");
        int ks3 = scanner.nextInt();

        System.out.print("vize sınavı 1: ");
        int vs1 = scanner.nextInt();

        System.out.print("vize sınavı 2: ");
        int vs2 = scanner.nextInt();

        System.out.print("final sınavı: ");
        int fs = scanner.nextInt();

        int ksOrt = ks1 + ks2 + ks3;
        int vOrt = vs1 + vs2;

        vOrt = ksOrt * 50/100 + vOrt * 50/100;
        int BP = vOrt * 40/100 + fs * 60/100;
        
        System.out.println("Başarı puanı: "+BP);

        scanner.close();
    }
}
