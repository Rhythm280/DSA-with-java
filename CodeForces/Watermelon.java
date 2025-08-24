import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();

        if(isEven(weight) && weight >= 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

    public static boolean isEven(double weight) {
        return weight % 2 == 0;
    }
}
