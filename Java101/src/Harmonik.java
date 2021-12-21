import  java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harmoniği hesaplanması istedğiniz sayıyı giriniz: ");
        int number = input.nextInt();
        double total = 0.0;

        for (double a = 1; a <= number; a++){
            total += 1/a;

        }System.out.println("Sonuç: " + total);
    }
}
