package PropertiesOfOOPs.Inheritence;

public class Box {
    // inheritance
    private double l;
    double h;
    double w;
    // double weight;

    Box() {
        // here it will inherits thee properties from the Object class.
        // Every class has {@code Object} as a superclass. All objects,
        // including arrays, implement the methods of this class.
        super();
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Print Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}