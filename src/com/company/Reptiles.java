package com.company;

public abstract class Reptiles extends Animal implements canSwim, canWalk {

    public Reptiles(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void attack(Animal defending) {
        if (!defending.isDead() && !this.isDead()) {
            if(defending instanceof canSwim && defending instanceof Mammals){
                defending.setDead();
                float newWeight = this.getWeight() + defending.getWeight() / 2;
                this.setWeight(newWeight);
            }else{
                super.attack(defending);
            }

        }

    }
}
