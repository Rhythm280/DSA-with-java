// package OOPs;

public class IntroductionOfOOPs {
    public static void main(String[] args) {
        Student s1 = new Student(); // an instance of the class, phisical reality which occupy space and memory.
        // new: it is a keyword in Java which is used to create an object of the class,
        // it will dynamically allocate memory for the object at run-time.
        System.out.println(s1); // OOPs.Student@1b6d3586
        System.out.println(s1.rno); // 43
        System.out.println(s1.name); // Rhythm
        System.out.println(s1.marks); // 32.01

        Student s2 = new Student(1, "John", 90.0f); // an instance of the class, phisical reality which occupy space and memory.
        System.out.println(s2); // OOPs.Student@4554617c
        System.out.println(s2.rno); // 1
        System.out.println(s2.name); // John
        System.out.println(s2.marks); // 90.0

        Student s3 = new Student(s2); // an instance of the class, phisical reality which occupy space and memory.
        System.out.println(s3); // OOPs.Student@74a14482
        System.out.println(s3.rno); // 1
        System.out.println(s3.name); // John
        System.out.println(s3.marks); // 90.0
        // s3 = s2; // shallow copy
    }
}

class Student {
    // it is the template of the object, a logical construct
    int rno;
    String name;
    float marks;

    Student() {
        // default constructor
        // rno = 0;
        // name = null;
        // marks = 0.0f;
        this(12, "Joy", 90.2f); // constructor chaining
        // this(new Student(43, "Rhythm", 32.01f)); // only one constructor can be
        // called at a time
    }

    Student(Student other) {
        // copy constructor
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}