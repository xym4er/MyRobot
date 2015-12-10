package com.chornyiya.myrobot.Limbs;

import com.chornyiya.myrobot.Materials.CastIron;
import com.chornyiya.myrobot.Materials.Material;
import com.chornyiya.myrobot.Materials.Plastic;
import com.chornyiya.myrobot.Materials.Steel;

public abstract class Limb {
    private Material material;
    protected String name;

    protected Limb() {
        switch ((int)Math.random()*3){
            case 0: material= new Plastic();
                break;
            case 1: material= new Steel();
                break;
            case 2: material= new CastIron();
                break;
        }
    }

    public Material getMaterial() {
        return material;
    }

    public abstract String getName();
}
