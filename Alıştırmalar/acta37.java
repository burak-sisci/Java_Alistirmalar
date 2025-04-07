/*Klavyeden girilen N elemanlı bir A dizisindeki pozitif elemanları 
B dizisine ve negatif elemanları da 
C dizisine yerleştiren programın kodlarını yazınız? */

import java.util.Arrays;
import java.util.Random;
public class acta37 {
    public static void main(String[] args) {
        Random random  = new Random();

        int elemanSayisi = random.nextInt(21);

        int[] dizi = new int[elemanSayisi];

        for(int i=0; i<dizi.length;i++) {
            dizi[i] = random.nextInt(21)-10;
        }

        int negatifDizi[] = new int[0];
        int pozitifDizi[] = new int[0];

        for(int i=0; i<dizi.length; i++) {
            if(dizi[i]<0) {
                negatifDizi = Arrays.copyOf(negatifDizi,negatifDizi.length+1);
                negatifDizi[negatifDizi.length-1] = dizi[i];
            }
            else if(dizi[i]>0) {
                pozitifDizi = Arrays.copyOf(pozitifDizi,pozitifDizi.length+1);
                pozitifDizi[pozitifDizi.length-1] = dizi[i];

            }
        }
        System.out.println("dizi: "+Arrays.toString(dizi));
        System.out.println("dizideki pozitif sayılar: "+Arrays.toString(pozitifDizi));
        System.out.println("dizideki negatif sayılar: "+Arrays.toString(negatifDizi));
    }
}
