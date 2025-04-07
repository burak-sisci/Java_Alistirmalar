/*100 elemanlı sayısal bir dizinin elemanlarına 1-1000 arasında rastgele değer atandıktan sonra 
bu elemanlardan değeri 5'e tam bölünen aynı zamanda 3'e tam bölünemeyen sayıları sayan, 
toplamlarını hesaplayan ve bu sayıları listeleyen bir program yazınız. */


import java.util.Arrays;
import java.util.Random;
public class acta36 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] dizi = new int[100];

        for(int i = 0; i<dizi.length; i++) {
            dizi[i] = random.nextInt(1001)+1;
        }
        System.out.println(Arrays.toString(dizi));

        int[] yeniDizi = new int[0];
        for(int i=0; i<dizi.length; i++) {
            if(dizi[i] %5 == 0 && dizi[i] %3 != 0) {
                yeniDizi = Arrays.copyOf(yeniDizi,yeniDizi.length+1);
                yeniDizi[yeniDizi.length-1] = dizi[i];
            }
        }
        int toplam = 0;
        for(int i=0; i<yeniDizi.length; i++) {
            toplam += yeniDizi[i];
        }
        System.out.println("toplam: "+toplam);
        System.out.println("dizi: "+Arrays.toString(yeniDizi));
    }
}
