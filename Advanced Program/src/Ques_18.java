public class Ques_18 {

        public static void main(String[] args) {
            int maxInt = Integer.MAX_VALUE;
            System.out.println("Maximum int value: " + maxInt);

            int overflowedInt = maxInt + 1;
            System.out.println("After adding 1 to max int: " + overflowedInt);

            int minInt = Integer.MIN_VALUE;
            System.out.println("Minimum int value: " + minInt);

            int underflowedInt = minInt - 1;
            System.out.println("After subtracting 1 from min int: " + underflowedInt);
        }
    }

