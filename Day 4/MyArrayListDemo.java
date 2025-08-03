import java.util.ArrayList;

public class MyArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        System.out.println(alist.size());
        alist.add(10);
        alist.add(20);
        alist.add(30);
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
            
        }
        for (Integer val : alist) {
            System.out.println(val);
        }
        // System.out.println(alist.size());
        // System.out.println(alist);
        // System.out.println(alist.contains(30));
        // alist.remove(1);
        // System.out.println((alist));
        // int s=alist.indexOf(30);
        // System.out.println(s);
        // alist.remove(s);
        // System.out.println(alist);
        // alist.clear();
        // System.out.println(alist.size());

    }
}