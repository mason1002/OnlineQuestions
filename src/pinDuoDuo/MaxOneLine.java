/*
     Author:Mason
     2018/12/16 21:47
*/

public class MaxOneLine {

    public int[] maxOneLine(int[][] matrix){
        int[] ans = new int[2];
        int max = 0;
        int col = 0;
        int tmep = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j< matrix[i].length; j++){
                if (matrix[i][j] == 1){
                    max++;
                }

            }

        }


        return ans;
    }


    public static void main(String[] args) {

    }

}
