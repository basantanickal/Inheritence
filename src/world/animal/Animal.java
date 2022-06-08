package world.animal;

import world.LivingOrganism;

abstract class Animal extends LivingOrganism {
    protected String name;
    public int age;

    public Animal() {
        // do nothing
    }

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();

    public static void main(String[] args) {
    }
}