package com.chornyiya.myrobot.Limbs;


import com.chornyiya.myrobot.Materials.Material;

public abstract class Limb {
    private final Material material;
    protected String name;

    protected Limb(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public abstract String getName();
}
