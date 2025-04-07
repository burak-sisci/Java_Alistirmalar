/*Aşağıdaki gibi tanımlanan ve değer atanan dizinin;
a. Her bir satırının ayrı ayrı toplamını bulup ekrana yazdırınız.
b. Her bir sütunun ayrı ayrı toplamını bulup ekrana yazdırınız.
c. Dizi elemanlarından değeri klavyeden girilecek bir sayısal değerden büyük olanları 0 yapınız.
int sayilar[][] = { {99, 37, 15, 51, 20, 78, 99, 33, 92, 41},
{98, 93, 41, 19, 27, 93, 63, 36, 63, 28},
{23, 20, 50, 56, 28, 79, 81, 39, 33, 49},
{33, 36, 58, 92, 47, 32, 74, 32, 23, 26},
{92, 88, 78, 68, 65, 81, 26, 89, 23, 54},
{94, 61, 41, 84, 40, 79, 79, 84, 49, 21},
{80, 76, 83, 54, 55, 57, 75, 44, 11, 26},
{10, 35, 77, 57, 14, 79, 37, 39, 88, 23},
{84, 32, 34, 81, 81, 53, 71, 39, 62, 39},
{89, 45, 20, 93, 18, 90, 98, 32, 16, 17} }; */

import java.util.Scanner;
import java.util.Arrays;
public class acta38 {
    public static void main(String[] args) {
        int dizi[][] = {
            {99, 37, 15, 51, 20, 78, 99, 33, 92, 41},
            {98, 93, 41, 19, 27, 93, 63, 36, 63, 28},
            {23, 20, 50, 56, 28, 79, 81, 39, 33, 49},
            {33, 36, 58, 92, 47, 32, 74, 32, 23, 26},
            {92, 88, 78, 68, 65, 81, 26, 89, 23, 54},
            {94, 61, 41, 84, 40, 79, 79, 84, 49, 21},
            {80, 76, 83, 54, 55, 57, 75, 44, 11, 26},
            {10, 35, 77, 57, 14, 79, 37, 39, 88, 23},
            {84, 32, 34, 81, 81, 53, 71, 39, 62, 39},
            {89, 45, 20, 93, 18, 90, 98, 32, 16, 17} 
        };        

        SatirlarinToplami(dizi);
        System.out.println("\n\n\n");
        SutunlarinToplami(dizi);
        System.out.println("\n\n\n");
        BuyukDegeriSifirYap(dizi);
        System.out.println("\n\n\n");



    }
    public static void SatirlarinToplami(int[][] dizi) {
        int[] satirSayisi = new int[dizi.length];
        Arrays.fill(satirSayisi,0);

        for(int i=0; i<dizi.length; i++) {
            for(int j=0; j<dizi[i].length; j++) {
                satirSayisi[i] += dizi[i][j];
            }
            System.out.println((i+1)+". satırdaki değerlerin toplamı: "+satirSayisi[i]);
        }
    }
    public static void SutunlarinToplami(int[][] dizi) {
        int[] sutunSayisi = new int[dizi[0].length];
        Arrays.fill(sutunSayisi, 0);

        
        for(int i=0; i<dizi[0].length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                sutunSayisi[i] += dizi[j][i];
            }
            System.out.println((i+1)+". sutundaki değerlerin toplamı: "+sutunSayisi[i]);
        }
    }
    public static void BuyukDegeriSifirYap(int[][] dizi) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        int deger = scanner.nextInt();

        for(int i=0; i<dizi.length; i++) {
            for(int j=0; j<dizi[i].length; j++) {
                if(deger<dizi[i][j]) {
                    dizi[i][j] = 0;
                }
                System.out.print(dizi[i][j]+"\t");
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
