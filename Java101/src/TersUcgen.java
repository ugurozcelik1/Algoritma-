import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int step = input.nextInt();
        int a = step;
        while (a>0){
            for (int i = a; i <= step; i++){
                System.out.print(" ");
            }
            for (int j=1; j <= 2*a-1; j++){
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
    }
}
