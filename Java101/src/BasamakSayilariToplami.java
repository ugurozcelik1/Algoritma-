import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();

        int  total = 0, tempNumber = number;
        while (tempNumber != 0){
            int a = tempNumber % 10;
            total += a;
            tempNumber /= 10;
        }
        System.out.println(number + " sayısının basamak sayıları toplamı: " + total);
    }
}
