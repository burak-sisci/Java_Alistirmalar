//Klavyeden girilen a ve b sayılarından a nın b ye tam bölünüp bölünmediğini bulan ve sonucu ekrana yazdıran program

import java.util.Scanner;

public class acta6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("a sayısını gir: ");
        int a = scanner.nextInt(); 

        System.out.println("b sayısını gir: ");
        int b = scanner.nextInt();

        if (a %b == 0) {
            System.out.println("a sayısı b sayısına tam bölünür. ");
        }
        else {
            System.out.println("a sayısı b ye tam bölünmez. ");
        }
        scanner.close();
    }
}
