//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to our first challenge!");
        System.out.println("===========================================");
        Increment.increment();
        System.out.println("============================================");

        System.out.println("Hello and welcome to our second challenge!");
        System.out.println("============================================");
        StringChallenge.stringDemo();
        System.out.println("=====Multithreading with Runnable Interface========");

        Multithreading multithreading = new Multithreading();

        Thread thread = new Thread(multithreading);
        thread.start();

        VarargsDemo.varargsDemo("Hello", "World", "Varargs", "Demo");

        int sum = VarargsDemo.addNumbers(1, 2, 3, 4, 5);

        VarargsDemo.varargsDemo("Sum of numbers: " + sum);

        System.out.println(VarargsDemo.addNumbers2("Sum: ", 1, 2, 3, 4, 5));    // Prints "Sum: 15"
        System.out.println(VarargsDemo.addNumbers2("Total: ", 10, 20));         // Prints "Total: 30"
        System.out.println(VarargsDemo.addNumbers2("Empty sum: "));             // Prints "Empty sum: 0"
    }
}