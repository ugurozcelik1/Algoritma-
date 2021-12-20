import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        for (int a = 1; a < number; a *= 4){
            System.out.print(a + ", ");
        }for (int b = 5; b < number; b *=5){
            System.out.print(b + ", ");
        }
    }
}
