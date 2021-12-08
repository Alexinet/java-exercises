package com.company.Robot;

public class Robot extends Thread {
    legs leg;

    Robot(legs leg) {
        this.leg = leg;
    }

    @Override
    synchronized public void start() {
        System.out.println(leg);
    }
}