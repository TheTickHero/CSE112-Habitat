package com.company;

public abstract class Birds extends Animal implements canFly{

    public Birds(String name, float weight) {
        super(name, weight);
    }

    @Override
    public final void attack(Animal defending) {
        super.attack(defending);
    }
}
