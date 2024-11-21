package methods;

public class Method4 {
    public static void main(String[] args) {
        // variable arguments
        numbers(1,2,3,4,5,5,6);
        num(10,210,"sdf", "asdf", "asfgs");
    }
    static void numbers(int ...v){
        System.out.println(v);
    }
    static void num(int a, int b, String ...v){
        
    }
}
