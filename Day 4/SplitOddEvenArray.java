import java.util.ArrayList;
import java.util.Arrays;

public class SplitOddEvenArray {
    public static void main(String[] args) {
        int[]arr={2,3,-4,5,6,1,7};
        ArrayList<Integer>oddList=new ArrayList<>();
        ArrayList<Integer>evenList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) continue; // Skip negative numbers
            // Check if the number is even or odd
            if(arr[i]%2==0){
                evenList.add(arr[i]);
            }else{
                oddList.add(arr[i]);
            }
        }
         
       
        System.out.println("Even numbers: " + evenList);
        System.out.println("Odd numbers: " + oddList);
     // Combine the two lists into a single array
        int[]res=new int[oddList.size()+evenList.size()];
        int i;
        for(i=0;i<oddList.size();i++){
            res[i]=oddList.get(i);
        }
       
        for(int j=0;j<evenList.size();j++){
            res[i++]=evenList.get(j);
        }
        System.out.println(Arrays.toString(res));
    }
}

    