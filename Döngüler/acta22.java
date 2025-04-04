/*Kendisi hariç bütün pozitif çarpanları (tam bölenleri) toplamı, 
yine kendisine eşit olan sayılara "mükemmel sayı" denir. 

Örneğin 6=1+2+3, 28=1+2+4+7+14 gibi. 

Buna göre klavyeden girilen bir tamsayının "mükemmel sayı" olup olmadığını kontrol eden programın kodlarını yazınız */

import java.util.Scanner;
public class acta22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        int sonuc = 0;

        for(int i=1;i<sayi;i++) {
            if(sayi %i == 0){
                sonuc +=i;
            System.out.print("+"+i);
            }
        }
        System.out.println("= "+sonuc);
        if(sonuc == sayi) System.out.println(sayi+" sayısı mükemmel sayıdır. ");
        else System.out.println(sayi+" sayısı mükemmel sayı değildir. ");

        scanner.close();
    }
}