public class Humans {
    int age;
    String name;
    int salary;
    static int population; // static variable
    // static variable is shared by all the objects of the class
    Humans(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Humans.population += 1;
    }

    public static void main(String[] args) {
        Humans h1 = new Humans(23, "John", 1000);
        System.out.println(h1.age); // 23
        System.out.println(h1.name); // John
        System.out.println(h1.salary); // 1000
        System.out.println(Humans.population); // 1
        h1.greetings(); // Hello John

        Humans h2 = new Humans(25, "Jane", 2000);
        System.out.println(h2.age); // 25
        System.out.println(h2.name); // Jane
        System.out.println(h2.salary); // 2000
        System.out.println(Humans.population); // 2
        h2.greetings(); // Hello Jane
    }

    void greetings() {
        System.out.println("Hello " + this.name);
        // this keyword is used to refer to the current object
        // this keyword is used to refer to the instance variable of the class
    }
}
