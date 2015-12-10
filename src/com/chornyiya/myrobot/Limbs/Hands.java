package com.chornyiya.myrobot.Limbs;

import com.chornyiya.myrobot.Materials.Material;

public class Hands extends Limb {
    public Hands(Material material) {
        super(material);
        name = "Рука";
    }

    @Override
    public String getName() {
        return name;
    }

}
