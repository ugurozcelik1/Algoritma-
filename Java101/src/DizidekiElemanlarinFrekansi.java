public class DizidekiElemanlarinFrekansi {
    static boolean check (int[] list, int i){
        for (int j = 0; j < i; j++)
            if (list[j] == list[i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        for (int i = 0; i < list.length; i++) {
            if (check(list,i)){
                int times = 1;
                for (int j = 0; j < list.length; j++) {
                    if (i != j && list[i] == list[j]) {
                        times++;
                    }
                }
                System.out.println(list[i] + " sayısı " + times + " kere tekrar edildi.");
            }
        }
    }
}
