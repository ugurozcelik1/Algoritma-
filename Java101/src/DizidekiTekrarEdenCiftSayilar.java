public class DizidekiTekrarEdenCiftSayilar {
    static boolean find (int[] array, int value){
        for (int i: array){
            if (i == value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {10, 3, 88, 7, 9,  7, 10, 17, 88};
        int[] dublicate = new int[list.length];
        int a = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (i != j && list[i] == list[j] && (list[i] % 2 == 0)){
                    if (!find(dublicate,list[i])){
                        dublicate[a] = list[i];
                        a++;
                    }
                }

            }
        }
        System.out.print("Tekrar eden sayılar: ");
        for (int i: dublicate)
            if (i != 0)
                System.out.print(i + ", ");
    }
}
