/*Bir otomobil kışın ısıdan dolayı %5 daha fazla yakıt tüketir. 

Yazın ortalama olarak 1-50 km/h giderken 100 km de 10 litre, 
51-100 km/h giderken 100 km de 7,5 litre, 
101-150 km/h giderken 100 km de 9 litre yakıt tüketmektedir. 

Buna göre mevsim (yaz için Y, kış için K girildiğini düşününüz), 
ortalama hız bilgisi ve gideceği mesafe girildikten sonra kaç litre yakıt tüketeceğini hesaplayıp 
ekrana yazdıran programın kodlarını yazınız */


import java.util.Scanner;
public class acta11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hangi mevsim (Y,K): ");
        char mevsim = scanner.next().charAt(0);

        System.out.print("kaç kilometre yol gittin: ");
        int yolUzunlugu = scanner.nextInt();

        System.out.print("ortalama hız: ");
        int ortalamaHız = scanner.nextInt();
        
        float yakıtTuketimi = 0;

        if (1<=ortalamaHız && ortalamaHız<=50) {
            yakıtTuketimi = yolUzunlugu*10;
        }else if(50<ortalamaHız && ortalamaHız<=100) {
            yakıtTuketimi = yolUzunlugu*75/100;
        }else if (100<ortalamaHız && 150<=ortalamaHız) {
            yakıtTuketimi = yolUzunlugu*9;
        }

        if (mevsim == 'K' || mevsim == 'k') {
            yakıtTuketimi = yakıtTuketimi*105/100;
        }

        System.out.println("yakıt tüketimi: "+yakıtTuketimi+"₺");

        scanner.close();
    }
}

