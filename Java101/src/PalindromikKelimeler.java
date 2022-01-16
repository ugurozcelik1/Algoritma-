import java.util.Scanner;

public class PalindromikKelimeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String word = input.nextLine();

        boolean isEqual = true;

        for (int i = 0, j = word.length() - 1; j >= 0;i++, j--){
            if (word.charAt(i) != word.charAt(j)){
                System.out.println(word + " kelimesi palindromik değildir.");
                isEqual = false;
                break;
            }
        }
        if (isEqual)
            System.out.println(word + " kelimesi palindromik kelimedir.");
        
    }
}
