/*Üç basamaklı, basamaklarının küpleri toplamı kendisine eşit olan tam sayılara Armstrong sayı denir. 
Örneğin: 371 = 33 + 73 + 13. Bu sayıları bulan bir program yazınız */

public class acta30 {
    public static void main(String[] args) {
        for(int i = 100;i<=999;i++) {
            int sayac = 1;
            if(ArmstrongSayisiMi(i)) {
                System.out.println(sayac+". "+i);
                sayac++;
            }
        }
    }
    public static boolean ArmstrongSayisiMi(int sayi) {
        int basamak1 = sayi/100;
        int basamak2 = (sayi/10) % 10;
        int basamak3 = sayi % 10;

        if(sayi == (basamak1*basamak1*basamak1)+(basamak2*basamak2*basamak2)+(basamak3*basamak3*basamak3)) return true;
        else return false; 
    }
}
