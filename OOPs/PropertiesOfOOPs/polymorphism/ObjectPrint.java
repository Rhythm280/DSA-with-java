package PropertiesOfOOPs.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        // this method will override the actual toString method which is present inside the Object class. because by default in java every class extnd to the Object class.
        // when I run this program then at run time it will determine that this methos should run because of run-time polymorphism (method overriding).
        return this.num + "";
    }

    public static void main(String[] args) {
        Object obj = new ObjectPrint(45);
        ObjectPrint obj1 = new ObjectPrint(4);
        // every class in java extends object class
        System.out.println(obj);
        System.out.println(obj1);
    }
} 
