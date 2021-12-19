import java.util.Scanner;
public class DordeTamBolunenlerinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;
        do {
            System.out.print("Sayıyı giriniz: ");
            number = input.nextInt();
            if (number%4 == 0){
                total += number;
            }
        }while (number > 0);
        System.out.println(total);
    }
}
