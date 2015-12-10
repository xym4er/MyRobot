package com.chornyiya.myrobot.Limbs;

import com.chornyiya.myrobot.Materials.Material;

public class Legs extends Limb {
    public Legs(Material material) {
        super(material);
        name = "Ноги";
    }

    @Override
    public String getName() {
        return name;
    }
}
