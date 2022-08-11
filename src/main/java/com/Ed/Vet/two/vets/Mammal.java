package com.Ed.Vet.two.vets;

public abstract class Mammal extends Animal
{
    public String talking = "";


    protected Mammal(String talking)
    {
        super("Brandon", false, 10);
        this.talking = talking;
    }

    public String getTalking()
    {
        return talking;
    }

    public void setTalking(String talking)
    {
        this.talking = talking;
    }
}
