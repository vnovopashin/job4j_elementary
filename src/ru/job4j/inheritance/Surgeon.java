package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean scalpel;

    public boolean isScalpel() {
        return scalpel;
    }

    public void setScalpel(boolean scalpel) {
        this.scalpel = scalpel;
    }

   // public boolean operate() { }
}
