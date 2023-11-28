package PassbyReference;

public class Main {
    public static void main(String[] args) {

        PassByReference reference = new PassByReference();
        reference.number2 = 7;

        System.out.println("Number2 first value: " + reference.number2);
        reference.change(reference);

        System.out.println("Number2 2nd value: " + reference.number2);
    }
}
