package PropertiesOfOOPs.Abstraction;

public class Main {
    public static void main(String[] args) {
        // WhatsApp w = new WhatsApp(); // we can't create an object of abstract class
        Application a1 = new Application();
        WhatsApp a2 = new Application();
        a1.send();
        a1.receive();
        a2.send();
        a2.receive();
    }
}
