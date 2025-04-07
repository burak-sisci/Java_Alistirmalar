/*100 elemanlı bir diziye 1-200 arasında rastgele sayılar üreterek aktaran, 
bu sayılar üzerinde; 
a)100'den büyük sayıların sayısını bulan 
b)100'den küçük sayıların ortalamasını bulan
c)Çift sayıların sayısını bulan */

import java.util.Random;
public class acta34 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] dizi = new int[100];

        System.out.print("dizi: ");
        for(int i = 0; i < dizi.length; i++) {
            dizi[i] = random.nextInt(200)+1;
            System.out.print(dizi[i]+" ");
        }
        System.out.println("\n\n");

        System.out.println("dizideki yüzden büyük sayılar: "+YuzdenBuyukSayilar(dizi));
        System.out.println("\n\n");

        System.out.println("dizideki yüzden küçük sayılar: "+YuzdenKucukSayilar(dizi));
        System.out.println("\n\n");

        System.out.println("dizideki çift sayıların sayısı: "+CiftSayilarinSayisi(dizi));        
        System.out.println("\n\n");
    }

    public static String YuzdenBuyukSayilar(int[] dizi) {
        String yuzdenBuyukler = "";
        for(int i = 0; i < dizi.length; i++) {
            if(100<dizi[i]) {
                yuzdenBuyukler += dizi[i]; 
                yuzdenBuyukler += " ";
            }    
        }
        return yuzdenBuyukler;
    }
    public static String YuzdenKucukSayilar(int[] dizi) {
        String yuzdenKucukler = "";
        for(int i = 0; i < dizi.length; i++) {
            if(100>dizi[i]) {
                yuzdenKucukler += dizi[i]; 
                yuzdenKucukler += " ";
            }    
        }
        return yuzdenKucukler;
    }
    public static int CiftSayilarinSayisi(int[] dizi) {
        int sayac = 0;
        for(int i = 0; i<dizi.length; i++) {
            if(dizi[i] %2 == 0)     sayac++;
        } 
        return sayac;
    }
}
