import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day number (0=Sunday, 1=Monday, ..., 6=Saturday):");
        int today = sc.nextInt();
        System.out.println("Enter days to meet:");
        int daysToMeet = sc.nextInt();
        int res = (today + daysToMeet) % 7;
        if(res == 0){
            System.out.println("SUNDAY");
        }
        else if(res == 1){
            System.out.println("MONDAY");
        }
        else if(res == 2){
            System.out.println("TUESDAY");
        }
        else if(res == 3){
            System.out.println("WEDNESDAY");
        }
        else if(res == 4){
            System.out.println("THURSDAY");
        }
        else if(res == 5){
            System.out.println("FRIDAY");
        }
        else {
            System.out.println("SATURDAY");
        }
        sc.close();
    }
}
