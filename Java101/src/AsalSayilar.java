public class AsalSayilar {
    public static void main(String[] args) {

        System.out.println("Asal sayılar: ");
        for (int a = 1; a <=100; a++){
            int total = 1;
            for (int i = 2; i < a; i++){
                total *= (a % i);
            }
            if (total != 0) {
                System.out.print(a + ", ");
            }
        }







    }
}
