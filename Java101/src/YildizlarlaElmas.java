import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Elmas merkezine kadar olan basamak sayısı: ");
        int n = input.nextInt();

        // İki ayrı döngü olcak. İlk döngü üçgen, ikinci ters üçgen.
        for (int i = 1; i <= n; i++){
            for (int a = 1; a <= n-i; a++){
                System.out.print(" ");
            }
            for (int b = 1; b <= 2*i-1; b++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        //İkinci üçgene başlıyoruz. Ama yıldız sondaki satırdan bir eksik olacak.
        for (int j = 1; j < n; j++){
            for (int q = 1; q <= j; q++){
                System.out.print(" ");
            }
            for (int w = 1; w <= 2*(n-j)-1; w++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}