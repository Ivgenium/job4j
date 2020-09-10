package ru.job4j.oop;

public class Doctor extends Profession {
    private String clinic;
    public Doctor(String name, String surname, String education, String birthday, String clinic) {
        super(name, surname, education, birthday);
        this.clinic = clinic;
    }
    public Diagnosis establishDiagnosis(Pacient pacient) {
        return new Diagnosis();
    }
    public void heal(Pacient pacient) {

    }
}
