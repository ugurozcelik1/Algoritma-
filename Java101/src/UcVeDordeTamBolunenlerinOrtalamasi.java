import java.util.Scanner;
public class UcVeDordeTamBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();
        int d = 0, total = 0;

        //Kaç kere döndüğünü bilmemiz gerekiyor
        for (int a = 0; a<=number; a++){

            if (a % 3 == 0 || a % 4 == 0){
                total += a;
                d++;
            }
        }
        System.out.println(number + " sayısına kadar olan üçe tam bölünen ve dörde tam bölündenlerin ortalaması: " + total / d);
    }
}
