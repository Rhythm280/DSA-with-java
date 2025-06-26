package PropertiesOfOOPs.Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4, 45, 23);
        Box box2  = new Box(box);
        System.out.println(box.w + " " + box.h);
        System.out.println(box2.w + " " + box2.h);

        BoxWeight bw1 = new BoxWeight();
        BoxWeight bw2 = new BoxWeight(2, 3, 4, 5);
        System.out.println(/*bw1.l can not access it becuase it is private */ " " + bw1.w + " " + bw1.h + " " + bw1.weight);
        System.out.println(/*bw2.l can not access it becuase it is private */ " " + bw2.w + " " + bw2.h + " " + bw2.weight);

        // can we access the elements present insiide the child class with the help of parent class?
        // logically the answer is no, we can only access the parent properties from the child class not the parent property from the child class.

        // teh box type object not been able to use chid class parameters why?
        Box box3 = new BoxWeight(2, 3, 4, 5);
        // in this case we are able to access the properties of the Box class but not able to access the properties of the BoxWeight class why?
        System.out.println(box3.w);
        System.out.println(box3);
        // System.out.println(box3.weight);
        // it is importent to understans it is not the type of the object it is the type if the reference variable whih determines what members can be access.
        // basially the parent class is referencing to the child class.
        // if the reference to a subclass object is assigned to the super class reference variable then we only have the access to those parts of the object which are defined in the super class.

        // BoxWeight bw0 = new Box(231,213,13); // this will show an error because, here we are trying to referencing a child to a parent.
        // System.out.print(bw0.h);

        // there are many variables in parent and child.
        // we are give access to the variables that are in the ref. type i.e. BoxWeight/
        // hence, we should have access to weight veriable.
        // this also means, that the ones we are trying to access should be initialized.
        // here, when the object is of parent class, how will we call the constructor of the child class.
        // and the parent class have no idea about the members of the chils class. but, the child class knows about the members of the parent class.



        // multi level inheritnce
        BoxPrice bp1 = new BoxPrice(5, 8, 200);
        System.out.println(bp1);
        System.out.println(bp1.w + " " + bp1.weight + " " + bp1.cost);

        // multiple inheritence: when more class is extending more than one class. class C inherits the properties of both class A and class B.
        // but there is a problem here ex if there is same member in both the partnt class then it will make difficult for the subclass to choose which class member to access. so, that the reason why java don't support multiple inheritence.
        // but can we implement this possibility with the help of interfaces.

        // hierarchi inheritence: one class i inherited by many classes. all the concept which we have discussed in single inheritencs are same here. in this the one subclass can not acces the members of the other subclasses.

        // hybrid inheritence: it is the combination of single and multiple inheritence. but not in java because multiple inheritence is not allowed in java. to do this we need to know al=bout interfaces.
    }
}
