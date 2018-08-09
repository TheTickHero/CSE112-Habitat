package com.company;

public abstract class Reptiles extends Animal implements canSwim, canWalk {

    public Reptiles(double weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending) {
        if (!defending.isDead() && !this.isDead()) {
            if (defending instanceof Mammals) {
                if (defending instanceof canSwim && defending instanceof canFly){
                    super.attack(defending);
                } else {
                    defending.setDead(true);
                }


            }

        }

    }
}
