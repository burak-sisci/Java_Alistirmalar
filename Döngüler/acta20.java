/*Klavyeden girilen bir sayının tam bölenlerini ekrana yazdırınız */


import java.util.Scanner;
public class acta20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        for(int i=1;i<=sayi;i++) 
            if(sayi %i == 0) 
                System.out.print(i+" ");
        scanner.close();
    }
}
