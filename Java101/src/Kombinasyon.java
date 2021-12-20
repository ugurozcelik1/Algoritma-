import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkici sayıyı giriniz: ");
        int b = input.nextInt();

        int total1 = 1, total2 = 1, total0 = 1;

        for (int i = 1; i <= a; i++){
            total1 *= i;
        }
        for (int ii = 1; ii <= b; ii++){
            total2 *= ii;
        }
        for (int iii = 1; iii <= (a-b); iii++){
            total0 *= iii;
        }
        System.out.println("C(" + a + "," + b + ")= " + total1/(total2*total0));
    }
}
