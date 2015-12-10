package com.chornyiya.myrobot;

import com.chornyiya.myrobot.Limbs.*;
import com.chornyiya.myrobot.Materials.*;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private List<Limb> limbs = new ArrayList<Limb>();

    Robot() {
        initRobot();
    }

    private void initRobot() {
        limbs.add(new Head(getRandomMaterial()));
        limbs.add(new Body(getRandomMaterial()));
        limbs.add(new Hands(getRandomMaterial()));
        limbs.add(new Legs(getRandomMaterial()));
    }

    public int getTotalWeight() {
        int result = 0;
        for (int i = 0; i < limbs.size(); i++) {
            result += limbs.get(i).getMaterial().getWeight();
        }
        return result;
    }

    private Material getRandomMaterial() {
        switch ((int) (Math.random() * 3)) {
            case 0:
                return new Plastic();
            case 1:
                return new Steel();
            case 2:
                return new CastIron();
            default:
                return null;
        }
    }

    public void about() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < limbs.size(); i++) {
            builder.setLength(0);
            builder.append(limbs.get(i).getName() + ":\n");
            builder.append("    Материал: " + limbs.get(i).getMaterial().getName() + "\n");
            builder.append("    Вес: " + limbs.get(i).getMaterial().getWeight() + "\n");
            System.out.print(builder.toString());
        }
        System.out.println("Общий вес: " + getTotalWeight());
    }

    public int dividingTheTotalWeight(int dividend) {
        System.out.println(dividend);
        if (dividend == 0) {
            return 0;
        } else {
            return dividingTheTotalWeight(dividend / 2);
        }
    }
}
