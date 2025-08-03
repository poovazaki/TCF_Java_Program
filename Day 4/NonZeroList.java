import java.util.ArrayList;
import java.util.Arrays;

public class NonZeroList {
    public static void main(String[] args) {
        int[]arr={2,0,0,3,4,5,6,8,0,9};
        ArrayList<Integer>nonZeroList=new ArrayList<>();
        ArrayList<Integer> zeroList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                nonZeroList.add(arr[i]);
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroList.add(arr[i]);
            }
        }
        System.out.println("Non-zero elements: " + nonZeroList);
        System.out.println("Zero elements: " + zeroList);
        // Combine the two lists into a single array
        int[] res = new int[nonZeroList.size() + zeroList.size()];
        int i;
        for (i = 0; i < nonZeroList.size(); i++) {
            res[i] = nonZeroList.get(i);
        }
        System.out.println("Combined array: " + Arrays.toString(res));

    }
}
