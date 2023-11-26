package Veriables;

public class Veriables {

    public static void main(String[] args) {

        int[] numbers1 = { 2, 4, 6, 8 };
        // int[] numbers2 = { 1, 3, 5, 9 };
        // Shallow copy
        // numbers2 = numbers1;

        int[] numbers2 = new int[numbers1.length];

        for (int i = 0; i < numbers1.length; i++) {
            numbers2[i] = numbers1[i]; // deep copy
        }

        for (int i : numbers2) {
            System.out.println(i + "..");
        }

        numbers1[0] = 99;
        System.out.println(numbers2[0]);

    }

}
