import java.util.Scanner;

public class YearWeekDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days:");
        int n= sc.nextInt();
        int year=n/365;
        int weeks=(n%365)/7;
        int days=(n%365)%7;
        System.out.println(year+"years"+" "+weeks+"weeks"+" "+days+"days");
        sc.close();
    }
}
