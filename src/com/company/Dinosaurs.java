package com.company;

public abstract class Dinosaurs extends Animal implements canWalk {

    public Dinosaurs(double weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending){
        if(defending instanceof canFly){

        }else if(defending instanceof Dinosaurs){
            defending.setDead(true);
            this.setDead(true);
        }else{
            super.attack(defending);
        }

    }
}
