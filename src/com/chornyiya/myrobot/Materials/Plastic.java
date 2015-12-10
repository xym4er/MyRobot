package com.chornyiya.myrobot.Materials;

public class Plastic extends Material {
    protected final String name = "Пластик";


    @Override
    protected void setWeight() {
        weight = (int)(Math.random()*10+1);
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}
