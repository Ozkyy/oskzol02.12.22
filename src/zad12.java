import java.util.Scanner;

public class zad12 {
    public static void main(String[] args){
        double a = 1;
        double b = 2;
        double c ;
        double d ;
        double e = 0;

        Scanner klawisz = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        b = klawisz.nextInt();
        System.out.println(b);
        c = b;
        for(int i = 0; i<b; i++){
            d = a / c;
            e = e+d;
            a++;
            c--;
        }

        System.out.print(" wynosi:" + e);

    }

}
