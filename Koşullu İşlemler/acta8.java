/*Bir öğrencinin klavyeden girilen 100 lük notunu harfe çeviren program,
a.
0<=notu<25 ➔ F
b.
25<=notu<45 ➔ E
c.
45<=notu<55 ➔ D
d.
55<=notu<70 ➔ C
e.
70<=notu<85 ➔ B
f.
85<=notu<=100 ➔ A */


import java.util.Scanner;

public class acta8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("sayı gir: ");
        int not = scanner.nextInt();
    
        char harfNotu = ' ';

        if (0<=not && not<25) {
            harfNotu = 'F';
        }
        else if (25<=not && not<45) {
            harfNotu = 'E';
    
        }
        else if (45<=not && not<55) {
            harfNotu = 'D';
    
        }
        else if (55<=not && not<70) {
            harfNotu = 'C';
    
        }
        else if (70<=not && not<85) {
            harfNotu = 'B';
    
        }
        else if (85<=not && not<=100) {
            harfNotu = 'A';
        }
        else {
            System.out.println("Geçersiz not girişi!");
        }
        if (harfNotu != ' ') {
            System.out.println("Harf notu: " + harfNotu);
        }        
        
        scanner.close();
    }
}
