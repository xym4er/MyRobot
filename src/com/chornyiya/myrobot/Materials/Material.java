package com.chornyiya.myrobot.Materials;

public abstract class Material {
    protected int weight;

    Material(){
        setWeight();
    }

    protected abstract void setWeight();

    public abstract int getWeight();

    public abstract String getName();

}
