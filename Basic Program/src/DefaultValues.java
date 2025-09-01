public class DefaultValues {

        int intVar;
        float floatVar;
        double doubleVar;
        long longVar;
        short shortVar;
        byte byteVar;
        char charVar;
        boolean booleanVar;
        String stringVar;

        void DefaultValues() {
            System.out.println("Default int value: " + intVar);
            System.out.println("Default float value: " + floatVar);
            System.out.println("Default double value: " + doubleVar);
            System.out.println("Default long value: " + longVar);
            System.out.println("Default short value: " + shortVar);
            System.out.println("Default byte value: " + byteVar);
            System.out.println("Default char value: '" + charVar + "'");
            System.out.println("Default boolean value: " + booleanVar);
            System.out.println("Default String value: " + stringVar);
        }

        public static void main(String[] args) {
            DefaultValues obj = new DefaultValues();
            obj.DefaultValues();
        }
    }

