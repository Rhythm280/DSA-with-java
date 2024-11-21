package methods;

public class Method1 {
    public static void main(String[] args) {
        //java doesn't support pass by reference it only support pass by  value.
        int a = 10;
        int b = 20;
        String name = "Joy";
        int [] arr = {10, 22,4,42,4,341};
        swap(a, b);//in this value of a and b has been passed to the num1 and num2.
        changeName(name); // in this the copy of the value of the reference variable (name) has been passed (naam) which means the value of the value beacause we are not changing the object we are creating a new object.
        change_array(arr);// in this the copy of the value of the reference variable (arr) has been passed (ary) which meant the real valu will get affected if we made changes in the object
        System.out.println(a+" "+b);//it will not swap the values it will print a = 10 and b = 20.
        System.out.println(name);//it will not change he character value to rhythm.
        System.out.print(arr[1]);// it will print 100 instead of 22.
    }

    //in this method the value to the num1 and num2 is beening chang it will not affect thee value of a and b.
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    // in this method the new object is been created and the naam will be pointeg to wards that but the name will still point towards the "joy".
    static void changeName(String naam){
        naam = "rhythm";
    }

    //in this method we are modifying the copy value of reference variable. so, the vale of the reference variable will be modefied to.
    static void change_array(int[] ary){
        ary [1] = 100;
    }
}

//for all the primitive data types value is been passed. but for all the non-primitive data types the value of the reference varible has been passed.
//if we make a change to the object vio this refence variable, same object will be changed.