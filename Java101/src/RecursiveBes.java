import java.util.Scanner;

public class RecursiveBes {
    static void five (int n, int a) {
        if (a > 0) {
            a -= 5;
            System.out.print(a + " ");
            five(n,a);
        }else {
            fivePlus(n,a);
        }
    }
    static void fivePlus (int n, int b){
        if (b != n){
            b += 5;
            System.out.print(b + " ");
            fivePlus(n,b);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = input.nextInt();
        System.out.print(n + " ");
        five(n,n);
    }
}
