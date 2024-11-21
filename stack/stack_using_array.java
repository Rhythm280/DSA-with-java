package stack;

public class stack_using_array {
    static int top = -1;

    public static void main(String[] args) {
        stack_using_array obj = new stack_using_array();
        int[] arr = new int[5];
        obj.push(arr, 10);
        obj.push(arr, 10);
        obj.push(arr, 100);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void push(int[] arr, int data){
        top = top + 1;
        if(top != arr.length - 1){
            arr[top] = data;
        }
        else{
        System.out.println("overflow");
        }
    }
}
