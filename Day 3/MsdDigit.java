import java.util.Scanner;

public class MsdDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int count= (int)Math.log10(n)+1;
        System.out.println("no. of digits "+count);
        int p=(int)Math.pow(10,count-1);
        System.out.println("power:"+p);
        System.out.println("msd:"+(n/p));
        sc.close();
    }
}
