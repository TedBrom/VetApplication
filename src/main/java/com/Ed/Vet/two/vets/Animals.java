package com.Ed.Vet.two.vets;

public class Animals
{
    private String name;

    private int age;

    private String species;

    public Animals(String name,int age,String species)
    {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    @Override
    public String toString()
    {
        return "{" +
                "\"name\"= \"" + name +
                "\", \"email\"=\"" + age +
                "\", \"catchPhrase\"=\"" + species +
                "\"}";
    }
}
