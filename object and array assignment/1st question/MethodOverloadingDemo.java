public class MethodOverloadingDemo {

    // Method 1: Overloaded method with one parameter (int)
    public void display(int a) {
        System.out.println("Integer value: " + a);
    }

    // Method 2: Overloaded method with two parameters (int, double)
    public void display(int a, double b) {
        System.out.println("Integer value: " + a + ", Double value: " + b);
    }

    // Method 3: Overloaded method with three parameters (int, double, String)
    public void display(int a, double b, String c) {
        System.out.println("Integer value: " + a + ", Double value: " + b + ", String value: " + c);
    }

    public static void main(String[] args) {
        // Create an object of MethodOverloadingDemo
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        
        // Calling the methods with different parameters
        demo.display(5);                          // Calls method with 1 parameter
        demo.display(10, 20.5);                   // Calls method with 2 parameters
        demo.display(100, 50.5, "Hello World!");  // Calls method with 3 parameters
    }
}
