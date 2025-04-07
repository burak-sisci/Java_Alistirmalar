/*Elemanları tam sayı olan bir A dizisinin(20 elemanlı) rastgele sayılar atayan, 
sonra dizi elemanlarının aritmetik ortalamasını hesaplayan 
ve elemanlardan kaç tanesinin bu ortalamadan büyük olduğunu sayan programın kodlarını yazınız */


import java.util.Random;
import java.util.Arrays;
public class acta35 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] dizi = new int[20];
        for(int i = 0; i < dizi.length; i++) {
            dizi[i] = random.nextInt(201)+(-101);
        }
        String diziString = Arrays.toString(dizi);
        System.out.println("dizi: "+diziString);
        
        int ortalama = 0; 
        for(int i = 0; i < dizi.length; i++) {
            ortalama += dizi[i];
        }
        ortalama /= dizi.length;

        System.out.println("dizinin ortalaması: "+dizi);

        int sayac = 0;
        for(int i=0; i<dizi.length; i++) {
            if(dizi[i]>ortalama) {
                sayac++;
            }
        }

        System.out.println("ortalamadan büyük eleman sayısı: "+sayac);
    }
}
