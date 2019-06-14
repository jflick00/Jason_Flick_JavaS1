package com.company;

public class Store {

    private Chips chips;
    private SodaPop sodaPop;
    private Chocolate chocolate;
    private boolean isStocked;

    // Getters and Setters
    public Chips getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public SodaPop getSodaPop() {
        return sodaPop;
    }

    public void setSodaPop(SodaPop sodaPop) {
        this.sodaPop = sodaPop;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public boolean isStocked() {
        return isStocked;
    }

    public void setStocked(boolean stocked) {
        isStocked = stocked;
    }

    // Default
    public Store() {

    }

    public void toOrder(boolean isStocked) {

    }
}
