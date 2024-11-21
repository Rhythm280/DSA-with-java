package conditional;

import java.util.Scanner;

public class find_NCR_and_NPR {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int r = obj.nextInt();
        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;
        obj.close();
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nrfact *= i;
        }
        double NCR = nfact / (rfact * (nrfact));
        double NPR = nfact / nrfact;
        System.out.println(NCR);
        System.out.println(NPR);
    }
}
