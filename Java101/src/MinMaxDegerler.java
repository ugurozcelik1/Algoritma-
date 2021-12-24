import java.util.Scanner;

public class MinMaxDegerler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı giriceksiniz: ");
        int howMany = input.nextInt();
        System.out.print("1. Sayıyı giriniz: ");
        int number1 = input.nextInt();
        int a = number1;

        for (int i = 2; i <= howMany; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = input.nextInt();
            if (number <= number1){
                number1 = number;
            }else {
                a = number;
            }

        }
        System.out.println("En küçük sayı: " + number1);
        System.out.println("En büyük sayı: " + a);
    }
}
