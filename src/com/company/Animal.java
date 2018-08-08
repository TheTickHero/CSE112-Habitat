package com.company;

public  class Animal {

    private double weight;
    private boolean isDead;
    private static int count;
    private int ID;

    public Animal(double weight) {
        this.weight = weight;
        this.isDead = false;
        count++;
        this.ID = count;
    }


    public void attack(Animal defending){
        if (!defending.isDead && !this.isDead){
            if (defending.getWeight() < weight) {
                System.out.println(defending.getClass().getSimpleName() + " is dead");
                defending.setDead(true);
                this.weight = defending.weight / 2;
            }
        }
    }


    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getID() {
        return ID;
    }


}
