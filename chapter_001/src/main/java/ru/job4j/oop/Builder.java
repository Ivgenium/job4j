package ru.job4j.oop;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
    public Building createBuilding() {
        return new Building();
    }
    public void repairBuilding(Building building) {}
}
