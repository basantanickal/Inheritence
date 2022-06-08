package world.animal;
public class Human extends Animal {
    private static int numOfLegs = 2;
    private static int numOfHands = 2;

    private boolean literate = false;

    public Human (String name) {
        super(name);
        literate = false;
    }

    public void study () {
        literate = true;
    }

    public void run() {
        System.out.println("Running with 2 legs");
    }

    public boolean isLiterate() {
        return literate;
    }

    public static void main(String[] args) {
        Human me = new Human("Basanta");
        System.out.println(me.getName());
        System.out.println(me.isLiterate());
        me.study();
        System.out.println(me.isLiterate());
    }
}
