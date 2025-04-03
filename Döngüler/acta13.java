/*1-100 arasındaki tek sayıları ekrana yazan program */

public class acta13 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i %2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
