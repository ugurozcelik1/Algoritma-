import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin bir kenarının uzunluğunu yazınız: ");
        a = input.nextInt();
        System.out.print("Üçgenin diğer kenarının uzunluğunu yazınız: ");
        b = input.nextInt();

        System.out.println("Üçgenin hipotenüs kenarının uzunluğu: " + Math.sqrt(a*a+b*b));

        System.out.println("Üçgenin alanı: " + (a+b)/2);

    }
}
