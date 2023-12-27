public class VarargsExample {

    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addNumbers(1, 2, 3, 4, 5)); // Prints 15
        System.out.println(addNumbers(10, 20));       // Prints 30
        System.out.println(addNumbers());             // Prints 0
    }
}
