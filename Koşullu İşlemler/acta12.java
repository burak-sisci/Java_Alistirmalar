/*Bir yılın artık yıl olup olmadığını belirlemek için aşağıdaki adımları izleyin:
1) Yıl 4 ile eşit bölünebilir ise, adım 2'e gidin. Aksi durumda, 5. adıma gidin.
2) Yıl 100 ile eşit bölünebilir ise, adım 3'e gidin. Aksi durumda, 4. adıma gidin.
3) Yıl 400 ile eşit bölünebilir ise, adım 4'e gidin. Aksi durumda, 5. adıma gidin.
4) Yıl artık yıldır (366 gün vardır).
5) Yıl artık yıl değildir (365 gün vardır).
Buna göre klavyeden girilen bir yılın artık yıl olup olmadığını belirleyen kodları yazınız. */


import java.util.Scanner;
public class acta12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kontrol edilecek yıl: ");
        int yil = scanner.nextInt(); 

        boolean artikYilMi = false;

        if (yil %4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYilMi = true;
                }
            }else {
                artikYilMi = true;
            }
        }

        if (artikYilMi) {
            System.out.println("artık yıldır. ");
        }else {
            System.out.println("artık yıl değildir. ");
        }
        scanner.close();
    }
}
