import java.util.Random;

public class Odev_2121032746 {
    public static void main(String[] args) {
        int[][] labirent = new int[20][20];
        Random random = new Random();

        for (int kat = 0; kat < 20; kat++) {
            int tekSayac = 0;
            int ciftSayac = 0;
            int i = 0;

            while (i < 20) {
                int sayi = random.nextInt(99) + 1;

                boolean sayiVarMi = false;
                for (int j = 0; j < i; j++) {
                    if (labirent[kat][j] == sayi) {
                        sayiVarMi = true;
                        break;
                    }
                }

                if (!sayiVarMi) {
                    if (sayi % 2 == 1 && tekSayac < 10) {
                        labirent[kat][i] = sayi;
                        tekSayac++;
                        i++;
                    } else if (sayi % 2 == 0 && ciftSayac < 10) {
                        labirent[kat][i] = sayi;
                        ciftSayac++;
                        i++;
                    }
                }
            }
        }

        System.out.println("Labirent Kapıları:\n");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(labirent[i][j] + "  ");
            }
            System.out.println("\n");
        }

        int toplam = 0;
        System.out.println("Açık kapılar:\n");

        for (int kat = 0; kat < 20; kat++) {
            int tekSayac = 0;
            int acikKapiDegeri = 0;

            for (int kapı = 0; kapı < 20; kapı++) {
                if (labirent[kat][kapı] % 2 == 1) {
                    tekSayac++;

                    if (tekSayac == 3) {
                        acikKapiDegeri = labirent[kat][kapı];
                        toplam += acikKapiDegeri;
                        System.out.println((kat + 1) + ". kat - Açık kapı: " + acikKapiDegeri); 
                    }
                }
            }
        }

        System.out.println("\nTüm açık kapıların değerleri toplamı: " + toplam);

    }
}