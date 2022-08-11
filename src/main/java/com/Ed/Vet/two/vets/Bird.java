package com.Ed.Vet.two.vets;

public abstract class Bird extends Animal
{
    private String call = "";
    private String colour = "";

    protected Bird(String call, String colour)
    {
        super("Matej", false, 2 );
        this.call = call;
        this.colour = colour;
    }

    public String getCall()
    {
        return call;
    }

    public void setCall(String call)
    {
        this.call = call;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }
}
