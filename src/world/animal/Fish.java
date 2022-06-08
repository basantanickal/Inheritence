package world.animal;
public class Fish extends Animal implements WaterAnimals {
    public void swim(){
        System.out.println("Fish swimming in water");
    }
    public void breatheOnWater(){
        System.out.println("Fish breathing in water");
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
}