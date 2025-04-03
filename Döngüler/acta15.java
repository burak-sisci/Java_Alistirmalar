/*1 ile klavyeden girilen sayı arasında 5’e bölünebilen sayıları ekrana yazan program */

import java.util.Scanner;
public class acta15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("sayı gir: "); 
        int i = scanner.nextInt();
    
        for(int j=0;j<=i;j++) {
            if (j %5 == 0) {
                System.out.print(" "+j);
            }
        }
        scanner.close();
    }    
}

