package PropertiesOfOOPs.Inheritence;

public class BoxWeight extends Box {
    // this class will inherit all the properties of Box class.
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        // there are many variables in parent and child.
        // we are give access to the variables that are in the ref. type i.e. BoxWeight/
        // hence, we should have access to weight veriable.
        // this also means, that the ones we are trying to access should be initialized.
        // here, when the object is of parent class, how will we call the constructor of the child class.
        // and the parent class have no idea about the members of the chils class. but, the child class knows about the members of the parent class.
        weight = other.weight;
    }

    public BoxWeight(double l , double w, double h, double weight) {
        // the parent class will always inetialize 1st because the subclass cares about what the super class contins because subclass inherita the properties from the super class.
        super(l, w, h); // call the parent class constructor using super() method.
        // used to inetializaed the values present in parent class. it will not able to access those members of parent class which are private.
        // but in this case the no error is shown because the box class constructor is beeing called.
        // Every class has {@code Object} as a superclass. All objects,
        // including arrays, implement the methods of this class.
        // but in this case super() will point ot its directly abouve parent class.
        System.out.println("child class constructor");
        // super() used case:
        // 1. to call the constructor of the Object class.
        // 2. we can use super() in place as a this keywork but it will be used to acces the super class keyworld.
        // System.out.println(super.weight);
        // we use this if both the class have same member and we want to acces the memebr inside the super class then we use super keyword.
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
