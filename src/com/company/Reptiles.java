package com.company;

public abstract class Reptiles extends Animal implements canSwim, canWalk {

    public Reptiles(float weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending) {
        if (!defending.isDead() && !this.isDead()) {
            if(defending instanceof canSwim && defending instanceof Mammals){
                defending.setDead(true);
            }else{
                super.attack(defending);
            }

        }

    }
}
