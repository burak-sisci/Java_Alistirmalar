//Klavyeden girilen birbirine eşit olmadığı düşünülen iki sayıdan büyüğünü ekrana yazdıran program 


import java.util.Scanner;

public class acta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("sayı gir: ");
        int sayi1 = scanner.nextInt();

        System.out.println("bir sayı daha gir: ");
        int sayi2 = scanner.nextInt();

        if (sayi1<sayi2) {
            System.out.println(sayi2+" sayısı daha büyüktür. ");
        }
        else if (sayi1>sayi2) {
            System.out.println(sayi1+" sayısı daha büyüktür. ");
        }
        else {
            System.out.println("sayılar birbirine eşit. ");
        }
        scanner.close();
    }
}
