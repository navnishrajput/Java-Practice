import java.util.Scanner;

public class num_IS {
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number to check (=,-,+): ");
        int x = Sc.nextInt();
        if( x> 0){
            System.out.println("Enter Number "+x+ " is positive.");
        } else if (x<0) {
            System.out.println("Enter Number "+x+ " is negative.");

        }
        else {
            System.out.println("Your Enter is equal to Zero.");
        }

    }
}
