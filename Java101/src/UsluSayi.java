import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int i = input.nextInt();

        int total = 1;
        for (int c = 1; c <= i; c++){
            total *= a;
        }
        System.out.println("Cevap: " + total);
    }
}
