package com.chornyiya.myrobot;

import com.chornyiya.myrobot.Limbs.*;

public class Robot {
    private Head head;
    private Body body;
    private Legs legs;
    private Hands hands;
    private int totalWeight;

    Robot(){
        initRobot();
    }

    private void initRobot() {
        head = new Head();
        body = new Body();
        legs = new Legs();
        hands = new Hands();
    }

    public int getTotalWeight(){
        int result = head.getMaterial().getWeight();
        result += body.getMaterial().getWeight();
        result += legs.getMaterial().getWeight();
        result += hands.getMaterial().getWeight();
        return result;
    }

    public void about(){
        System.out.println(": ");
    }
}
