import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int number = input.nextInt();

        int[] list = new int[number];
        for (int i = 0; i < number; i++){
            System.out.print((i+1) + ". Elemanı: ");
            int a = input.nextInt();
            list [i] = a;
        }
        Arrays.sort(list);
        System.out.println("Sıralama: " + Arrays.toString(list));
    }
}
