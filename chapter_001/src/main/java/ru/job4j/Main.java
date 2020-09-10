package ru.job4j;

import ru.job4j.oop.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello,job4j!");
        Pacient ivanov = new Pacient();
        Dentist petrov = new Dentist(
                "Алексей",
                "Петров",
                "Врач-стоматолог общей практики , специалист , врач-стоматолог",
                "10.02.1980",
                "СМ-Клиника");
        Diagnosis diagnosis = petrov.establishDiagnosis(ivanov);
        petrov.healTooth(diagnosis.getOrgan());
        Pacient sidorov = new Pacient();
        Surgeon nosov = new Surgeon(
                "Иван",
                "Носов",
                "Врач-хирург общей практики , специалист , врач-хирург",
                "02.09.1984",
                "СМ-Клиника");
        Diagnosis diagnosis1 = nosov.establishDiagnosis(sidorov);
        nosov.operateOnOrgan(diagnosis1.getOrgan());
        Programmer zverev = new Programmer(
                "Василий",
                "Зверев",
                "Математик, системный программист",
                "02.09.1988");
        Srcipt srcipt = zverev.writeSrcipt();
        zverev.debugScript(srcipt);
        Builder blinov = new Builder(
                "Сергей",
                "Блинов",
                "Инженер-строитель",
                "01.08.1986");
        Building house = blinov.createBuilding();
        blinov.repairBuilding(house);
    }
}
