package world.animal;

public class Crocodile extends Animal implements LandAnimals, WaterAnimals{

    @Override
    public void swim() {
        System.out.println("Crocodile swimming in water");
        
    }

    @Override
    public void breatheOnWater() {
        System.out.println("Crocodile breathing in water");
        
    }

    @Override
    public void walkOnLand() {
        System.out.println("Crocodile walking on land");
        
    }

    @Override
    public void breatheOnAir() {
        System.out.println("Crocodile breathing air");
        
    }

    @Override
    public void run() {
        System.out.println("Crocodile running on land");
    }
    
}
