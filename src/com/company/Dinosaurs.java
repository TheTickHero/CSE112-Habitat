package com.company;

public class Dinosaurs extends Animal implements canWalk {

    public Dinosaurs(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void attack(Animal defending) {
        if(defending instanceof canFly){
            
        }else{
            super.attack(defending);
        }

    }
}
