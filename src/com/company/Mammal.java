package com.company;

public abstract class Mammal extends Animal{



    public Mammal(String name, double weight) {
        super(name, weight);

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
