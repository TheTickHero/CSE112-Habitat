package com.company;

public abstract class Reptiles extends Animal implements canSwim,canWalk {

    public Reptiles(double weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending) {
        if(defending instanceof canSwim){
            super.attack(defending);
        }else if(!defending.isDead() && !this.isDead()){
            defending.setDead(true);
        }

    }
}
