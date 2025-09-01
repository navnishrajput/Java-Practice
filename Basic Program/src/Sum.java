import java.util.Scanner;

public class Sum {

    int a;
    int b;
    void sum(int a, int b){
        this.a =a;
        this.b=b;
        int sum = a+b;
        System.out.println(sum);

    }
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter first integer values: ");
        int a = Sc.nextInt();
        System.out.println("Enter first integer values: ");
        int b = Sc.nextInt();
        Sum Sum = new Sum();
        Sum.sum(a,b);

    }

}
