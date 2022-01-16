import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(100);
        int right = 0;
        int selected;
        boolean isError = false;
        int[] wrong = new int[5];
        while (right < 5){
            System.out.print("0 ile 100 arasındaki tahmininiz: ");
            selected = input.nextInt();
            if (selected < 1 || selected > 99) {
                System.out.println("Hatalı giriş yaptınız. 0 ile 100 arasında bir değer giriniz.");
                if (isError){
                    right++;
                    System.out.println("Kalan hakkınız: " + (5 - right));
                }else {
                    isError = true;
                    System.out.println("Bir daha ki hatalı girişinizde hakkınızdan düşecektir.");
                }
                continue;
            }
            if (number == selected){
                System.out.println("Tebrikler, tahmininiz doğru. Sayı: " + selected);
                break;
            }else {
                if (selected < number){
                    System.out.println("Gizli sayı tahmininizden büyük.");
                }else System.out.println("Gizi sayı tahmininizden küçük");
                wrong[right] = selected;
                right++;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
            if (right == 5)
                System.out.println("Kaybettiniz. Tahminleriniz: " + Arrays.toString(wrong) + "\nGizli sayı: " + number);
        }

    }
}
