/*1 den 1000 e kadar 5’in katı olup 2 nin katı olmayan sayıların ekrana yazan program */

public class acta14 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            if (i %5 == 0) {
                if (i %2 != 0){
                    System.out.print(" "+i);
                }
            }
        }
    }
}
