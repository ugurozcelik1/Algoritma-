import java.util.Scanner;
import java.util.Arrays;

public class DizidekiEnYakinDegerler {
    public static void main(String[] args) {
        int [] list = {1, 5, 3, 9, 7};
        Scanner input = new Scanner(System.in);
        System.out.print("Değeri giriniz: ");
        int a = input.nextInt();

        Arrays.sort(list);

        int closeLess = a;
        int closeMore = a;
        for (int i: list)
            if (i < a) {
                closeLess = i;
            }

        for (int i: list)
            if (i > a) {
                closeMore = i;
                break;
            }

        System.out.println("Küçük en yakın değer: " + closeLess);
        System.out.println("Büyük en yakın değer: " + closeMore);
    }
}
