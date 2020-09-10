package ru.job4j.oop;

public class Programmer extends Engineer {
    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
    public Srcipt writeSrcipt(){
        return new Srcipt();
    }
    public void debugScript(Srcipt srcipt) {}
}
