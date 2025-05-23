public class Singleton {
    private Singleton() {
        System.out.println("Constructor called");
    }
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2); // true
        System.out.println(obj1); // Singleton@4554617c
        System.out.println(obj2); // Singleton@4554617c
        // both obj1 and obj2 point to the same instance
        // so the constructor is called only once
    }
}
