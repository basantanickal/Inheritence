package world;
public class LivingOrganism {
    private boolean dead;
    public LivingOrganism () {
        dead = false;
    }
    public void kill() {
        dead = true;
    }
    public boolean isLiving() {
        return !dead;
    }
    public static void main(String[] args) {
        System.out.println("Just a new line");
    }
}
