import java.util.ArrayList;

public class HashTableForRemovingDuplicates {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,2,1,3,1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (!list.contains(a[i])) {
                list.add(a[i]);
            }
        }
        System.out.println("Array without duplicates: " + list);
    }
}
