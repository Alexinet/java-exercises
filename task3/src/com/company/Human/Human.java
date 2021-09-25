package com.company.Human;

import java.util.Arrays;

public class Human {

    private Head head;
    private Leg[] legs;
    private Hand[] hands;

    public Human(Head head, Leg[] legs, Hand[] hands) throws Exception {
        if (legs.length > 2 || hands.length > 2) throw new Exception("Only 2 legs/hands are possible.");
        this.head = head;
        this.legs = legs;
        this.hands = hands;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg[] getLegs() {
        return legs;
    }

    public void setLegs(Leg[] legs) {
        this.legs = legs;
    }

    public Hand[] getHands() {
        return hands;
    }

    public void setHands(Hand[] hands) {
        this.hands = hands;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", legs=" + Arrays.toString(legs) +
                ", hands=" + Arrays.toString(hands) +
                '}';
    }
}
