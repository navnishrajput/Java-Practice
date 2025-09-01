
public class Ques_12 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        int sumInt = b1 + b2;
        System.out.println("byte + byte -> int: " + sumInt);

        int numInt = 500;
        long numLong = 1000000000L;
        long sumLong = numInt + numLong;
        System.out.println("\nint + long -> long: " + sumLong);
        char letter = 'A'; // ASCII value of 'A' is 65
        int offset = 1;
        int newAscii = letter + offset;
        char newLetter = (char) newAscii; // Explicitly cast back to char
        System.out.println("\nchar ('A') + int(1) -> int(ASCII): " + newAscii);
        System.out.println("Resulting char: " + newLetter);
    }
}
=======
public class Ques_12 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        int sumInt = b1 + b2;
        System.out.println("byte + byte -> int: " + sumInt);

        int numInt = 500;
        long numLong = 1000000000L;
        long sumLong = numInt + numLong;
        System.out.println("\nint + long -> long: " + sumLong);
        char letter = 'A'; // ASCII value of 'A' is 65
        int offset = 1;
        int newAscii = letter + offset;
        char newLetter = (char) newAscii; // Explicitly cast back to char
        System.out.println("\nchar ('A') + int(1) -> int(ASCII): " + newAscii);
        System.out.println("Resulting char: " + newLetter);
    }
}
>>>>>>> 081c43d5d9a1897b627cc66f1147dc043be0483f
