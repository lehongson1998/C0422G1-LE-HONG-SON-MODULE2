package ss3_arraya_and_method.bai_tap;

import java.util.Scanner;

public class LineArray2D {
    public static void main(String[] args) {
        int m, n;
        Scanner snc = new Scanner(System.in);
        System.out.println("enter m:");
        m = snc.nextInt();
        System.out.println("enter n:");
        n = snc.nextInt();
        int[][] array2d = new int[m][n];
        int i = 0, j, k, a, sum = 0;
        while (i < array2d.length) {
            for (j = 0; j < array2d[i].length; j++) {
                System.out.println("enter element :" + i + j);
                array2d[i][j] = snc.nextInt();
            }
            i++;
        }
        for (a = 0; a < array2d.length; a++) {
            for (k = 0; k < array2d[a].length; k++){
                if (a == k){
                    sum += array2d[a][k];
                }
            }
        }
        System.out.println("sum of Diagonal line array 2d = " + sum);
    }
}
