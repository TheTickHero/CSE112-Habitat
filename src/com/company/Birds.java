package com.company;

public abstract class Birds extends Animal implements canFly{

    public Birds(double weight) {
        super(weight);
    }

    @Override
    public final void attack(Animal defending) {
        super.attack(defending);
    }
}
