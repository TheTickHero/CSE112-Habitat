package com.company;

public class Reptiles extends Animal implements canSwim,canWalk {

    public Reptiles(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void attack(Animal defending) {

    }
}
