public class PalindromSayi {
    static boolean isPalindrom(int number){
        int tempNumber = number, lastNumber, reverseNumber = 0;
        while (tempNumber != 0){
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            tempNumber /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(343));
    }
}
