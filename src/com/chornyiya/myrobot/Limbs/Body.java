package com.chornyiya.myrobot.Limbs;

import com.chornyiya.myrobot.Materials.Material;

public class Body extends Limb {
    public Body(Material material) {
        super(material);
        name = "Туловище";
    }

    @Override
    public String getName() {
        return name;
    }
}
