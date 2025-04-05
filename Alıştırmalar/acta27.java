/*-30 ve 30 aralığında x, y'den farklı olmak üzere 
|x|+|y|<=30 eşitsizliğini sağlayan tamsayı çiftlerini ekrana yazan programın kodlarını yazınız. */


public class acta27 { 
    public static void main(String[] args) {

        for(int x = -30;x<=30;x++)  for(int y =-30;y<=30;y++)   Toplama(x, y);
    }

    public static void Toplama(int x,int y) {
        if(mutlakDeger(x)+mutlakDeger(y) <= 30) System.out.println("|"+x+"|+|"+y+"|<="+(mutlakDeger(x)+mutlakDeger(y)));        
    }
    public static int mutlakDeger(int sayi) {
        if(sayi<0) return (sayi*-1);
        else    return sayi;
    }
}