package com.company;

public  class Animal {

    private String name;
    private double weight;
    private boolean isDead;
    private int ID;

    public Animal(String name , double weight) {
        this.name = name;
        this.weight = weight;
        this.isDead = false;
        this.ID++;
    }

    public void attack(Animal defending){
        if(defending.getWeight() < this.getWeight()){
            System.out.println(defending.getName() + " is dead");
            defending.setDead(true);
        }
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isDead() {
        return isDead;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getID() {
        return ID;
    }
}
