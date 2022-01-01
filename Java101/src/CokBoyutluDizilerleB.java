public class CokBoyutluDizilerleB {
    public static void main(String[] args) {
        String[][] b = new String[7][4];
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++){
                if (i == 0 || i == 3 || i == 6)
                    b [i][j] = "* ";
                else if (j == 1 || j == 2)
                    b [i][j] = "  ";
                else b [i][j] = "* ";
            }
        for (String[] i: b) {
            for (String print : i)
                System.out.print(print);
            System.out.println();
        }
    }
}
