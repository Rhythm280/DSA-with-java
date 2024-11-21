package methods;

public class Mthod3 {
    static int x = 10;// this will be shadowed
    public static void main(String[] args) {
        System.out.println(x);// it will print 10
        int x = 40;
        System.out.println(x);// it will print 40 becaause it is thee lower levl scope varible & the variable at the high level scope will be hidden. 
        fun();// it will call fun() function
    }
    static void fun(){
        System.out.println(x);//print 10 because x=40 is not accessable to this method block only x = 10 can be accessed.
    }
}
