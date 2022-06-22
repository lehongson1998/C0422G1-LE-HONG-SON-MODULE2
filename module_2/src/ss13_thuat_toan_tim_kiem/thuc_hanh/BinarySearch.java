package ss13_thuat_toan_tim_kiem.thuc_hanh;

public class BinarySearch {
    static int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] array, int value) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(array, 79));
    }
}
