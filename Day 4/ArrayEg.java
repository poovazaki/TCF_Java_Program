import java.util.Arrays;
import java.util.Scanner;

public class ArrayEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int []a=new int[n];
        int sum=0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
            
        }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
            
        // }
    //     for(int val:a){
    //     System.out.println(val);
    // }
    System.out.println(Arrays.toString(a));
          System.out.println(sum);
        sc.close();
    }

}
