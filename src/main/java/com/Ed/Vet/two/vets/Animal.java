package com.Ed.Vet.two.vets;

public abstract class Animal
{
    private String names = "";
    private boolean dead;
    private int age;

    protected Animal(String names, boolean dead, int age)
    {
        this.names = names;
        this.dead = dead;
        this.age = age;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
