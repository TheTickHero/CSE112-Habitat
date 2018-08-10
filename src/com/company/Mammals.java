package com.company;

public abstract class Mammals extends Animal implements canWalk{

    public Mammals(float weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending) {
        super.attack(defending);
    }

    @Override
    public boolean isDead() {
        return super.isDead();
    }
}
