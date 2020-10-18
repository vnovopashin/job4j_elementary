package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean whiteRobe;

    public boolean isWhiteRobe() {
        return whiteRobe;
    }

    public void setWhiteRobe(boolean whiteRobe) {
        this.whiteRobe = whiteRobe;
    }

    public Diagnosis heal(Patient patient) { }
}
