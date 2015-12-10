package com.chornyiya.myrobot.Limbs;

import com.chornyiya.myrobot.Materials.Material;

public class Head extends Limb {
    public Head(Material material) {
        super(material);
        name = "Голова";
    }

    @Override
    public String getName() {
        return name;
    }
}
