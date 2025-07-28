public class OddAndEven {
    public static void main(String[] args) {
        int n=10;
        int Odd_sum=0;
        int Even_sum=0;
        int Total_sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                Even_sum+=i;
                
            }
            else{
                Odd_sum+=i;
            }
            Total_sum+=i;


        }
        System.out.println("Sum of Even numbers is: " + Even_sum);
        System.out.println("Sum of Odd numbers is: " + Odd_sum);
        System.out.println("Total sum is: " + Total_sum);
    }
    
}
