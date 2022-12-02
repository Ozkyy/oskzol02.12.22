import java.util.Scanner;
public class zad13 {
    public static void main(String[] args){
        int a;
        int b;

        Scanner klawisz = new Scanner(System.in);
        System.out.print("podaj liczbe a :");
        a = klawisz.nextInt();
        klawisz.nextLine();
        b = a;
        for(int g = -1;g<b; g++){
            for(int i = -1;i<a;i++){
                for(int f = 0;f<a;f++){
                    System.out.print("*");
                }
                System.out.print("\n");
                a--;
            }
        }




    }

}
