import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısı: ");
        int query = input.nextInt();
        int a=0, b=1;
        switch (query) {
            case 1:
                System.out.print(a);
                break;
            case 2:
                System.out.println(a + " " + b);
                break;
            default:
                System.out.print(a + " " + b + " ");
                for (int i=3; i<=query; i++){
                    if (i%2 == 1){
                        a += b;
                        System.out.print(a + " ");
                    }
                    else {
                        b += a;
                        System.out.print(b + " ");
                    }
                }
        }

    }
}
