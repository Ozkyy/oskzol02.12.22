import java.util.Scanner;
public class zad14 {
    public static void main(String[] args) {
        int b;
        int d=0;

        Scanner klawisz = new Scanner(System.in);
        System.out.print("podaj liczbe a: ");
        b = klawisz.nextInt();
        klawisz.nextLine();

        for(int g=0; g<b; g++){
            System.out.print("#");
            for(int i = 0; i<d;i++){
                System.out.print(" ");

            }
            System.out.print("#");
            System.out.print("\n");
            d++;
        }
    }
}