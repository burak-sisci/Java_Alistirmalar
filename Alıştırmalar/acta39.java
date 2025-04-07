/*Satır ve sütun sayısı klavyeden girilecek iki boyutlu sayısal diziye 50-100 arasında rastgele sayılardan değer atanacaktır. 
Değer atandıktan sonra her bir satırın aritmetik ortalamasını bulup ekrana yazdıran programı yazınız */


import java.util.Scanner;
import java.util.Random;
public class acta39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("sütun sayısını giriniz: ");
        int sutunSayisi = scanner.nextInt();

        int[][] dizi = new int[satirSayisi][sutunSayisi];

        int[] satirToplami = new int[satirSayisi];

        for(int i=0; i<satirSayisi; i++) {
            for (int j=0; j<sutunSayisi; j++) {
                dizi[i][j] = random.nextInt(51)+50;
                satirToplami[i] += dizi[i][j];
            }
            System.out.println((i+1)+". satırın ortalaması: "+(satirToplami[i]/sutunSayisi));
        }
        scanner.close();
    }
}
