/*𝑦!/𝑥!*(𝑥−𝑦)! İşlemini gerçekleştiren programın kodlarını yazınız. Klavyeden x ve y bilgileri girilecektir. 
Eğer kullanıcı y değerini x den büyük girerse veya negatif değer girerse “Yanlış veri girişi”, diye mesaj verilecektir. */

import java.util.Scanner;
public class acta31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x sayısını giriniz: ");
        int x = scanner.nextInt();

        System.out.print("y sayısının giriniz: ");
        int y= scanner.nextInt();

        if(y>x || y<0) System.out.println("yanlış veri girişi. ");
        else System.out.println("sonuç: "+Islem(x, y));

        scanner.close();
    }
    public static int Islem(int x,int y) {
        return (FaktoriyelHesapla(x)/FaktoriyelHesapla(y))*FaktoriyelHesapla((x-y));
    }
    public static int FaktoriyelHesapla(int sayi) {
        int sonuc = 1;
        for(int i = 1;i<=sayi;i++) sonuc*=i;
        return sonuc;
    }
}
