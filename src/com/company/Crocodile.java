package com.company;

public class Crocodile extends Reptiles {

    public Crocodile(String name, float weight) {
        super(name, weight);

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


}
