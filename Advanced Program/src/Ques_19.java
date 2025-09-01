public class Ques_19 {

        public static void main(String[] args) {
            long[] testValues = {
                    123456789L,
                    123456789012345L,
                    1000000000000000000L,
                    Long.MAX_VALUE,
                    Long.MIN_VALUE
            };

            for (long value : testValues) {
                boolean canStore = canLongBeStoredInFloat(value);
                System.out.println("Long value: " + value);
                System.out.println("Can be stored in float without precision loss? " + canStore);
                System.out.println();
            }
        }

        public static boolean canLongBeStoredInFloat(long value) {
            float floatValue = (float) value;
            long longFromFloat = (long) floatValue;
            return longFromFloat == value;
        }
    }
