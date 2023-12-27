public class VarargsDemo {
    // Variable-length argument list
    public static void varargsDemo(String... args) {
        System.out.println("Number of arguments: " + args.length);
        for (String arg : args) {
            System.out.println("arg: " + arg);
        }
        System.out.println("========Varargs=========");
    }

    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int addNumbers2(String message, int... numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(message + sum);
        return sum;
    }
}
