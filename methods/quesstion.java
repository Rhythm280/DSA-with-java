package methods;

public class quesstion {
    public static void main(String[] args) {
        // find the number is prime or not
        System.out.println(isprime(5));
        // print all the 3 digit armstrong numbers
        for(int i =100; i<= 999; i++){
            armstrong(i);
        }

    }
    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }

    static void armstrong(int a){
        int n = a;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            int cube = rem * rem * rem;
            sum+=cube;
            a = a / 10;
        }
        if(sum == n){
            System.out.println(n);
        }
    }
}
