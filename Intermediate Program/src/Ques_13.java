public class Ques_13 {
    static String  UniName = "Chitkara University";
    String Stu_Name;
    int Stu_id;
    public Ques_13(String name, int id) {
        this.Stu_Name = name;
        this.Stu_id = id;
    }
    public void Display(){
        System.out.println("-------Student Details----------");
        System.out.println("Student Name: "+ Stu_Name);
        System.out.println("Student id: "+ Stu_id);
        System.out.println("Uni name : "+UniName);
    }

    public static void main(String []args){
        Ques_13 obj = new Ques_13("Navnish" , 111);
        Ques_13 obj1 = new Ques_13("Navnish Rajput" , 11);

        System.out.println("######## Initial State #####");
        obj.Display();
        obj1.Display();

        obj.Stu_Name = "Prashant";
        System.out.println("\n--- After changing student1's name (instance variable) ---");
        obj.Display();
        obj1.Display();

        Ques_13.UniName = "CU";
        System.out.println("\n--- After changing university name (static variable) ---");

        obj.Display();
        obj1.Display();


    }


}
