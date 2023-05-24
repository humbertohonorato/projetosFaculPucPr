public class ForComMatriz {

    public static void main(String[] args) {
        final int LIN = 3; // Constante para número de linhas
        final int COL = 4; // Constante para número de colunas

        int [][] mat = new int[LIN][COL];
        int valor;

        for (int i8 = 0; i8 < LIN; i8++) {
            for (int j = 0; j < COL; j++) {
                valor = i8 + j;
                mat[i8][j] = valor;
                System.out.print(mat[i8][j] + " ");
            }
            System.out.println();
        }
    }
}
