/*10 kişilik bir sınıftaki öğrencilerin bir dersine ait vize ve final not bilgileri rastgele giriş yapılacaktır
(Uygun bir dizi tanımlanıp bilgiler diziye aktarılacak);
a. Her öğrencinin ortalamasını bulup ekrana yazdırınız(ortalama=vize*0.4+final*0.6).
b. Vizesi 50 den küçük olan öğrencilerin final notlarını ekrana yazdırınız.
c. Ortalaması 70 den küçük olanlar için ekrana “Geçti”, eşit ve ya büyük olanlar için “Kaldı” yazdırınız.
d. Vizesi 60-70 arası olup Finali 70 den büyük olan öğrencilerin notlarını ekrana yazdırınız 
ve kaç adet olduğunu bulup ekrana yazdırınız. */

import java.util.Arrays;
import java.util.Random;
public class acta40 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] sinav = new int[10][2];

        for (int i = 0; i < sinav.length; i++) {
            for (int j = 0; j < sinav[i].length; j++) {
                sinav[i][j] = random.nextInt(101);
            }   
        }

        System.out.println("dizinin tümü: ");
        for (int i = 0; i < sinav.length; i++) {
            System.out.print((i+1)+":\t");
            for (int j = 0; j < sinav[i].length; j++) {
                System.out.print(sinav[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("öğrencilerin ortalamaları: "+Arrays.toString(OrtalamaBulucu(sinav)));
        System.out.println();
        System.out.println("vizesi 50 altı olan öğrencilerin final notları: "+Arrays.toString(VizesiDusukler(sinav)));
        System.out.println();
        DersDurumları(sinav);
        System.out.println();
        BasariliOgrenciler(sinav);

    }

    public static int[] OrtalamaBulucu(int[][] sinav) {
        int[] ortalama = new int[sinav.length];
        Arrays.fill(ortalama,0);

        for (int i = 0; i < sinav.length; i++) {
            ortalama[i] = (sinav[i][0]*4+sinav[i][1]*6)/10;    
        }

        return ortalama;
    }

    public static int[] VizesiDusukler(int[][] sinav) {
        int[] dusukVizeSonuclari = new int[0];

        for (int j = 0; j < sinav.length; j++) {
            if(sinav[j][0]<50) {
                dusukVizeSonuclari = Arrays.copyOf(dusukVizeSonuclari,(dusukVizeSonuclari.length+1));
                dusukVizeSonuclari[dusukVizeSonuclari.length - 1] = sinav[j][1];
            }
        }

        return dusukVizeSonuclari;
    }

    public static void DersDurumları(int[][] sinav) {
        int ortalama;

        for (int i = 0; i < sinav.length; i++) {
            ortalama = 0;
            for (int j = 0; j < sinav[i].length; j++) {
                ortalama += sinav[i][j];
            }
            ortalama = (sinav[i][0]*4 + sinav[i][1]*6)/10;
            if(70<(ortalama)) {
                System.out.println((i+1)+". öğrenci geçti. ");
            }
            else {
                System.out.println((i+1)+". öğrenci kaldı. ");
            }
        }
    }

    public static void BasariliOgrenciler(int[][] sinav) {
        int sayac = 0;
    
        for (int i = 0; i < sinav.length; i++) {
            if (sinav[i][0] >= 60 && sinav[i][0] <= 70 && sinav[i][1] > 70) {
                sayac++;
                System.out.println((i+1) + ". öğrencinin vizesi: " + sinav[i][0] + " ve finali: " + sinav[i][1]);
            }
        }
    
        System.out.println("başarılı öğrenci sayısı: " + sayac);
    }
    }
