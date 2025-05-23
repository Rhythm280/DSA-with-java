public class StaticBlock {
    static int a = 4; // static variable
    static int b; // static variable
    static {
        System.out.println("static block 1");
        b = a + 10;
    }

    public static void main(String[] args) {
        StaticBlock s1 = new StaticBlock();
        System.out.println("a: " + StaticBlock.a); // 4
        System.out.println("b: " + StaticBlock.b); // 10
        StaticBlock.b = 20; // static variable can be accessed using class name
        System.out.println("a: " + StaticBlock.a); // 4
        System.out.println("b: " + StaticBlock.b); // 20
        StaticBlock s2 = new StaticBlock();
        System.out.println("a: " + StaticBlock.a); // 4
        System.out.println("b: " + StaticBlock.b); // 20
    }
}
