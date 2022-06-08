package ss3_arraya_and_method.bai_tap;

public class MaxElementArray2D {
    public static void main(String[] args) {
        double[][] array2d = {
                {1.0, 1.4, 3.8},
                {1.3, 2.5, 3.7},
                {3.5, 4.15, -1.89}
        };
        int i, j;
        double max = array2d[0][0];
        for (i = 0; i < array2d.length; i++){
            for (j = 0; j < array2d[i].length; j++){
                if (array2d[i][j] > max){
                    max = array2d[i][j];
                }
            }
        }
        System.out.println("max = " + max);
    }
}
