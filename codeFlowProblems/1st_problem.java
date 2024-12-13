import java.util.Scanner;
public class 1st_problem{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long n = obj.nextInt();
        long m = obj.nextInt();
        long a = obj.nextInt();
        long rows = (n + a - 1) / a;
        long cols = (m + a - 1) / a;
        long maxFlagStone = rows * cols;
        System.out.println(maxFlagStone);

    }
}