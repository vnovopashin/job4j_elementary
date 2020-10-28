package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean scalpel;

    public boolean isScalpel() {
        return scalpel;
    }

    public void setScalpel(boolean scalpel) {
        this.scalpel = scalpel;
    }

  //  public boolean removeTheTooth() { }
}
