/*Kare bir matrisin (satır ve sütun sayısı eşit matris) 
kardeş satır ve sütunu olup olmadığını belirlemek için bir metot yazılması istenmektedir. 
Metodun özellikleri şudur:
1. Metoda int veri tipinde iki boyutlu bir dizi ve bir adet sayısal değer (sıra no değeri) yollanacaktır.
2. Parametre olan dizinin, yollanan sıra no daki (yani indeks değeri olarak düşününüz) satırının elemanları toplamı ile 
sütunun elemanlarının toplamı birbirine eşit ise bu satır ve sütun “Kardeş” tir.
3. Bu durumda geriye true eğer “Kardeş” değilse false değerini döndürecektir.
4. Parametre değerlerinden sıra no değerinin dizinin satır ve sütun sayısından büyük olmadığını varsayınız.
5. Sadece metodu tanımlayıp içerisindeki kodları yazınız.
6. İpucu: kardesMi(gelenDizi, 2); şeklinde değer yollanırsa dizinin 3.satırı ile 
3.sütununun elemanlarının toplamını karşılaştırır. (30 puan) */


import java.util.Random;;
public class cikmis_soru2 {
    public static void main(String[] args) {
        Random random = new Random();

        int satirVeSutunSayisi = random.nextInt(20);

        int[][] dizi = new int[satirVeSutunSayisi][satirVeSutunSayisi];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = random.nextInt(10);
            }
        }
        int siraNo = random.nextInt(satirVeSutunSayisi);
        System.out.println(KardesMi(dizi, siraNo));
    }
    public static boolean KardesMi(int[][] dizi,int siraNo) {
        int toplam1 = 0, toplam2 = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam1 += dizi[i][siraNo];
            toplam2 += dizi[siraNo][i];
        }
        if(toplam1==toplam2) {
            return true;
        }
        else {
            return false;
        }
    }
}
