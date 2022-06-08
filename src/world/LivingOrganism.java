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
}
