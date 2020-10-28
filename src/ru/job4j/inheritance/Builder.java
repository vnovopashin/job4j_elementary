package ru.job4j.inheritance;

public class Builder extends Engineer {

    private boolean pencil;

    public boolean isPencil() {
        return pencil;
    }

    public void setPencil(boolean pencil) {
        this.pencil = pencil;
    }

    //public boolean draw() { }
}
