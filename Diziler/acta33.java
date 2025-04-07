/*1 haftaya ait sıcaklık bilgilerini içerisinde barındırabilecek bir dizi tanımlayınız. 
Klavyeden bu dizinin elemanlarına veri girişi yapınız. Ardından sıcaklık ortalamasını hesaplayıp ekrana yazdırınız */

import java.util.Scanner;
public class acta33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] haftalikSicaklik = new int[7];

        for(int i=0;i < haftalikSicaklik.length; i++) {
            System.out.print((i+1)+". günün sıcaklığı: ");
            haftalikSicaklik[i] = scanner.nextInt();
        }
        int toplam = 0;
        for (int j = 0; j < haftalikSicaklik.length; j++) {
            toplam += haftalikSicaklik[j];
        }
        toplam /=7;

        System.out.println("ortalama sıcaklık: "+toplam);

        scanner.close();
    }
}
