public class Ques_14 {


        public static void main(String[] args) {

            int decimalNumber = 255;
            long longDecimalNumber = 4294967295L;
            System.out.println("Converting the integer: " + decimalNumber);
            String binaryString = Integer.toBinaryString(decimalNumber);
            System.out.println("Binary representation: " + binaryString);
            String hexString = Integer.toHexString(decimalNumber);
            System.out.println("Hexadecimal representation: " + hexString);
            System.out.println("\nConverting the long: " + longDecimalNumber);

            String longBinaryString = Long.toBinaryString(longDecimalNumber);
            System.out.println("Binary representation: " + longBinaryString);

            String longHexString = Long.toHexString(longDecimalNumber);
            System.out.println("Hexadecimal representation: " + longHexString);
        }
    }


