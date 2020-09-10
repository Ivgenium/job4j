package ru.job4j.oop;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday, String clinic) {
        super(name, surname, education, birthday, clinic);
    }
    public void operateOnOrgan (HumanOrgan organ) {}
}
