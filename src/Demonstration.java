public class Demonstration {
    static int a=10;
    static void display()
    {
        System.out.println("Static Method");
    }
    static
    {
        System.out.println("Static block");
    }
    public static void main(String[] args) {

        System.out.println(+a);
        display();
    }
}
