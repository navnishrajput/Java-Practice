public class Swap_2 {

        int a = 10;
        int b = 20;
        void Swapvalues(){
            int a = b;
            b=a;
            a=b;
        }
        public static void main(String []args){
            Swap obj = new Swap();
            System.out.println("Values before swaping: ");
            System.out.println("Value of A : " +obj.a);
            System.out.println("Value of B : " +obj.b);

            obj.Swapvalues();

            System.out.println("Values after swaping: ");
            System.out.println("Value of A : " +obj.a);
            System.out.println("Value of B : " +obj.b);


        }
    }

