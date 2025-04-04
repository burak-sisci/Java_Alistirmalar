/*Çarpım tablosu programı yazınız. 
Klavyeden çarpan ve kaç adım olacağı bilgisi girildikten sonra aşağıdaki gibi bir çıktı veriniz:
Çarpan:5
Adım:6
1x5=5
2x5=10
3x5=15
4x5=20
5x5=25
6x5=30 */

import java.util.Scanner;
public class acta17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("çarpanı yazınız: ");
        int carpan = scanner.nextInt();

        System.out.print("adım sayısını girin: ");
        int adım = scanner.nextInt();

        for(int i=1; i<=adım; i++) {
            System.out.println(i+" x "+carpan+" = "+carpan*i);
        } 
        scanner.close();
    }
}
