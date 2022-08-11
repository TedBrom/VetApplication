package com.Ed.Vet.two.vets;

public class FlyingRat extends Bird implements Flight
{
    boolean canTakeOff = true;
    boolean canLand = true;
    boolean canFlap = true;

    public FlyingRat()
    {
        super("Squawk","Blue");
    }

    @Override
    public boolean takeOff()
    {
        return true;
    }

    @Override
    public boolean landing()
    {
        return true;
    }

    @Override
    public boolean flap()
    {
        return true;
    }
}
