package com.Ed.Vet.two.vets;


import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;


public class AnimalList
{
    private List<Animals> listOfAnimals= new ArrayList();


    public AnimalList(){
        this.listOfAnimals.add(new Animals("John",9,"Elephant"));
        this.listOfAnimals.add(new Animals("Brandon",8,"Penguin"));
        this.listOfAnimals.add(new Animals("Matej",7,"Badger"));
        this.listOfAnimals.add(new Animals("Ed",6,"Spider"));
        this.listOfAnimals.add(new Animals("Tom",5,"Buffalo"));
    }

    public List<Animals> getListOfAnimals()
    {
        return this.listOfAnimals;
    }

    public String toString(){
        String json = new Gson().toJson(listOfAnimals);
        return  json;
    }
}
