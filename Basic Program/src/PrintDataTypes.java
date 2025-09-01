class PrintDataTypes {
    void dataType(){
        int speed = 100;
        boolean myBoolean = true;
        char CharA = 'A';
        String MyString = "Navnish Rajput";
        short S = 123;
        long L = 1213242534L;
        float FloatType = 12.1f;

        System.out.println("int: " + speed);
        System.out.println("boolean: " + myBoolean);
        System.out.println("char: " + CharA);
        System.out.println("String: " + MyString);
        System.out.println("short: " + S);
        System.out.println("long: " + L);
        System.out.println("float: " + FloatType);
    }

    public static void main(String[] args) {
        PrintDataTypes obj = new PrintDataTypes();
        obj.dataType();
    }
}