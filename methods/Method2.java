package methods;

public class Method2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // block scoping
        {
            a = 15;
            System.out.println(b); //it will execute inside the block because a variable is initialized inside the main block.
            int c = 84;
            System.out.println(c);
        }

        // for scoping
        for(int i = 1; i < 10; i++){
            System.out.print(i);//it will only executed inside the for loop only not accessable outside the loop.
        }
        System.out.println(a);// the value of the variable a will be changed as it was first initialized in main block then the value is changed in the block
        // System.out.println(c); this will show an error because c variable is initialized inside the block

    }
}
