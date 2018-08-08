package com.company;

public class Brachiosaurus extends Dinosaurs {

    public Brachiosaurus(double weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending) {
        if(defending instanceof canWalk){
            super.attack(defending);
        }
    }
}
