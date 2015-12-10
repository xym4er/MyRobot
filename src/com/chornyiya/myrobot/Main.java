package com.chornyiya.myrobot;


public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.about();
        System.out.println("Рекурсивное деление:");
        robot.dividingTheTotalWeight(robot.getTotalWeight());
    }
}
