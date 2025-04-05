/*Klavyeden girilen 3 basamaklı bir sayının basamaklardaki sayı değerlerini ekrana yazdırınız. 
(453 ➔ 4,5,3 ekrana yazdırılacak. Aritmetik işlem kullanarak int veri türünün özelliğinden faydalanınız.) */


import java.util.Scanner;
public class acta26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("3 basamaklı bir sayı yazınız: ");
        String sayi = scanner.nextLine();

        System.out.println(sayi.charAt(0)+","+sayi.charAt(1)+","+sayi.charAt(2));

        scanner.close();
    }
}
