package methods;
public class Methods {
    public static void main(String[] args) {
        hello(); //function calling
        int ans = sum(12, 18);
        System.out.println(ans);
    }
    //in this function we use void returnt type because it is returning nothing.
    static void hello(){ //function decleration
        System.out.println("Hello World.....!");  //function defination
    }
    // in this funtion with the arguments we use int return type because its returning the int value.
    static int sum(int a, int b){
        return a+b;
    }
}