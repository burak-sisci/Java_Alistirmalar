/*2015 yılı itibarı ile ülke nüfusu 77 milyondur. 
Yıllık nüfus artış oranı %1.3 tür. Sonraki 10 yılda ülke nüfusunu yıllara göre programın kodlarını yazınız */

public class acta21 {
    public static void main(String[] args) {
        int nufus = 77000000;
        int yil = 2015;

        do {
            System.out.println("nüfus: "+nufus);
            System.out.println("yil "+yil);
            nufus = nufus * 13/10;
            yil++;
        }while(yil<=2025);
    }
}
