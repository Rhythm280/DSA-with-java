package methods;

public class Method5 {
    public static void main(String[] args) {
        // function overloading
        sum(10,20,30); // this will call the second method
        sum(10,20); //this will call the first method
    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
