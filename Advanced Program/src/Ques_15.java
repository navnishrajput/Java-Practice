public class Ques_15 {

    public static void main(String[] args) {

        int primitiveVar = 42;
        String referenceVar = new String("Hello");
        System.out.println("Primitive variable value: " + primitiveVar);
        System.out.println("Reference variable value: " + referenceVar);
        System.out.println("Reference variable identity hash code: " + System.identityHashCode(referenceVar));
        System.out.println("Size of primitive int in bytes: " + Integer.BYTES);
    }
}
