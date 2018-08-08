package com.company;

public class Crocodile extends Reptiles {

    private String name;

    public Crocodile(double weight , String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public void attack(Animal defending) {
        if (!defending.isDead() && !this.isDead()){
            if (defending.getWeight() < this.getWeight()) {
                System.out.println( this.name + " is dead");
                defending.setDead(true);
                this.setWeight(defending.getWeight() / 2);
            }
        }
    }

    public String getName() {
        return name;
    }
}
