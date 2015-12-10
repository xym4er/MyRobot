package com.chornyiya.myrobot.Materials;

public class Steel extends Material {
    protected final String name = "Сталь";

    @Override
    protected void setWeight() {
        weight = (int) (Math.random() * 10 + 11);
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
