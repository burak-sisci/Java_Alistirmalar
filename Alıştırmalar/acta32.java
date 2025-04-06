/*Klavyeden girilecek a, m, z değerlerine göre aşağıdaki fonksiyonun sayısal değerini hesaplayacak kodu yazınız. 
Not: z > a olduğunu varsayınız ve bütün değerler 1 den büyük tam sayıdır.
𝑓(𝑎,𝑚,𝑛,𝑧)=n=1->mΣ(a/n)*(𝑧−𝑎)^n */

import java.util.Scanner;

public class acta32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a değerini giriniz: ");
        double a = scanner.nextDouble();

        System.out.print("m değerini giriniz: ");
        int m = scanner.nextInt();

        System.out.print("z değerini giriniz: ");
        double z = scanner.nextDouble();

        System.out.println("f(" + a + "," + m + "," + z + ") = " + FonksiyonHesapla(a, m, z));

        scanner.close();
    }

    public static double FonksiyonHesapla(double a, int m, double z) {
        double sonuc = 0;
        for (int n = 1; n <= m; n++) {
            sonuc += ((a/n) * Math.pow((z - a), n));
        }
        return sonuc;
    }
}
