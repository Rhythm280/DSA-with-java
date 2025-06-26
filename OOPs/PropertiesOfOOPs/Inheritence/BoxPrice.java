package PropertiesOfOOPs.Inheritence;

public class BoxPrice extends  BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = 0;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

    public static void information() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Box b = new BoxPrice();
        b.information();
    }
}