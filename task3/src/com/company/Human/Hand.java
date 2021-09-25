package com.company.Human;

public class Hand {

    private String length;
    private int fingerQuantity;

    public Hand(String length, int fingerQuantity) {
        this.length = length;
        this.fingerQuantity = fingerQuantity;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getFingerQuantity() {
        return fingerQuantity;
    }

    public void setFingerQuantity(int fingerQuantity) {
        this.fingerQuantity = fingerQuantity;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length='" + length + '\'' +
                ", fingerQuantity=" + fingerQuantity +
                '}';
    }
}
