/*Fibonacci dizisi bir sayı dizisidir 
ve {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, …} şeklinde devam eden sonsuz sayılardan oluşur. 
İlk 100 terimi ekrana yazdırınız */

import java.math.BigInteger;

public class acta28 {
    public static void main(String[] args) {
        BigInteger x=BigInteger.ONE,y=BigInteger.ONE,tmp=BigInteger.TWO;
        for(int i = 1; i <=100; i++) {
            System.out.println(i+". "+x);
            x=y;
            y=tmp;
            tmp=x.add(y);
        }
    }
}
