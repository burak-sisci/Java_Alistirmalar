import java.util.Scanner;

public class acta7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu girin: "); // "println" yerine "print" kullanıldı
        int vize = scanner.nextInt();

        System.out.print("Final notunu girin: "); // "println" yerine "print" kullanıldı
        int finalNotu = scanner.nextInt(); // "final" yerine "finalNotu" kullanıldı (Java anahtar kelimesi ile çakışma)

        double ortalama = vize * 0.4 + finalNotu * 0.6; // Ortalama hesaplama düzeltildi

        System.out.println("Ortalama: " + (int)ortalama); 

        if (ortalama >= 70) {
            System.out.println("BAŞARILI");
        } else {
            System.out.println("BAŞARISIZ");
        }

        scanner.close();
    }
}