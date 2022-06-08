package draft;

public class Draft1 {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 4, 5, 7, 8, 9};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");
        for (int j: myArray){
            System.out.print(j + " ");
        }
        System.out.println("\n");
        double[] newArray = {1.1, 1.5, 2.6, 3.7};
        for (double index: newArray) {
            System.out.println(index);
        }
    }
}
