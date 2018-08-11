package com.company;

public class Brachiosaurus extends Dinosaurs {

    public Brachiosaurus(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void attack(Animal defending) {
        if(defending instanceof canWalk){
            super.attack(defending);
        }
    }
}
