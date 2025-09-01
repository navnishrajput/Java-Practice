public class areaCircle {
    double pie = 3.71;
    int x;
    void Area(int x){
        this.pie = pie;
        this.x = x;
         double area = pie*x*x;
        System.out.println("Area of circle is: " +area);


    }
    public static void main(String []args){
        areaCircle obj = new areaCircle();
        obj.Area(2);


    }
}
