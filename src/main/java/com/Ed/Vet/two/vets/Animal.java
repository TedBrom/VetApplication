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
}
