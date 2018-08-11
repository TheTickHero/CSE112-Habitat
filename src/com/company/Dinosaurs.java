package com.company;

public abstract class Dinosaurs extends Animal implements canWalk {

    public Dinosaurs(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void attack(Animal defending) {
        if (defending instanceof canFly) {

        } else if (defending instanceof Dinosaurs) {
            defending.setDead();
            this.setDead();
        } else {
            super.attack(defending);
        }
    }


}
