package com.company;

public class Bird extends Animal implements canFly{

    public Bird(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void attack(Animal defending) {
        super.attack(defending);
    }
}
