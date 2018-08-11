package com.company;

public abstract class Mammals extends Animal implements canWalk{

    public Mammals(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void attack(Animal defending) {
        super.attack(defending);
    }

}
