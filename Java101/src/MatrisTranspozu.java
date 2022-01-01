public class MatrisTranspozu {
    static int[][] transpoz (int[][] matris){
        int[][] transpoz = new int[matris[0].length][matris.length];
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                 transpoz[j][i] = matris [i][j];
            }
        }
        return transpoz;
    }
    public static void main(String[] args) {
        int[][] matris = new int[2][3];
        int number = 1;
        for (int i = 0; i < matris.length; i++)
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = number;
                number++;
            }
        System.out.println("Matris : ");
        for (int[] i: matris) {
            for (int j : i)
                System.out.print(j);
            System.out.println();
        }
        System.out.println("Transpoze : ");
        int[][] transpoz = transpoz(matris);
        for (int[] i: transpoz){
            for (int j: i)
                System.out.print(j);
            System.out.println();
        }
    }
}
