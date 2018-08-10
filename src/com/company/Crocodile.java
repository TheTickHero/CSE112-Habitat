package com.company;

public class Crocodile extends Reptiles {

    private String name;

    public Crocodile(float weight , String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public void attack(Animal defending) {
        if (!defending.isDead() && !this.isDead()){
            if (defending.getWeight() < this.getWeight()) {
                defending.setDead();
                float newWeight = this.getWeight() + defending.getWeight() / 2;
                this.setWeight(newWeight);
            }
        }
    }

    public String getName() {
        return name;
    }
}
