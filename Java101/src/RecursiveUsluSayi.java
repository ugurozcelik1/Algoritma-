import java.util.Scanner;

public class RecursiveUsluSayi {
    static int power (int a, int b){
        if (b == 1){
            return a;
        }
        int result = power(a,b-1) * a;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int a = input.nextInt();
        System.out.print("Üssünü giriniz: ");
        int b = input.nextInt();

        System.out.println("Sonuç: " + power(a,b));
    }
}
