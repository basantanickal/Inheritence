package world.animal;
public class Cow extends Animal implements LandAnimals {
    private static int numOfLegs = 4;
    private boolean hasHorn;

    public Cow (String name, boolean hasHorn) {
        super(name);
        super.age = 20;
        this.hasHorn = hasHorn;
    }

    public Cow (String name) {
        this(name, false);
        //super(name);
        //super.age = 20;
        //this.hasHorn = false;
    }

    public void growHorn() {
        hasHorn = true;
    }

    public boolean hasHorn() {
        return hasHorn;
    }
    public void run() {
        System.out.println("Instance name: " + this.getName());
        System.out.println("Running with 4 legs");
    }

    public static void main(String[] args) {
        Cow myCow = new Cow("Beauty");
        //System.out.println(myCow.getName());
        //System.out.println(myCow.hasHorn());
        //myCow.growHorn();
        //System.out.println(myCow.hasHorn());
       // System.out.println(myCow.toString());
        //myCow.run();
        Cow anotherCow = new Cow("Another", true);
        anotherCow.run();
    }

    @Override
    public void walkOnLand() {
        System.out.println("Cow Waling on Land");
    }

    @Override
    public void breatheOnAir() {
        System.out.println("Cow breathing air");
    }
}
