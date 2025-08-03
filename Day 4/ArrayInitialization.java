import java.util.Arrays;

public class ArrayInitialization {
    public static void main(String[] args) {
        // Initializing an array with values
        int[]arr={2,3,4,5,1,6,7};
        System.out.println(Arrays.toString(arr));
        // Sorting the array
        // Arrays.sort(arr) sorts the array in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
