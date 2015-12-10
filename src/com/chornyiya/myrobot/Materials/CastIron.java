package com.chornyiya.myrobot.Materials;

public class CastIron extends Material {
    protected final String name = "Чугун";


    @Override
    protected void setWeight() {
        weight = (int)(Math.random()*10+21);
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
