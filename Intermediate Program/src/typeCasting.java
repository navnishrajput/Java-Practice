public class typeCasting {
    public static void main(String []args){

        System.out.println("....... Implicit type casting......");
        int speed = 100;
        double Casting = speed;

        System.out.println("Original Value of int:" +speed);
        System.out.println("Casted double: " +Casting);

        System.out.println("....... Explicit type casting......");

        float Avrage = 55.23f;
        int Explicit =(int) Avrage;
        System.out.println("Original Value of int:" +Avrage);
        System.out.println("Casted double: " +Explicit);


    }
}
