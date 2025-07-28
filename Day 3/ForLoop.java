public class ForLoop {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //    System.out.println(i+ " POO");
        // }
        // for(int i=5;i>=1;i--){
        //    System.out.println(i+ " POO");
        // }
        int n,count;
        n=5;count=0;
        for (int i=1;i<=n;i++){
            count=count+i;
        }
        System.out.println("Sum of  first 5 numbers is:"+count);

    }
}
