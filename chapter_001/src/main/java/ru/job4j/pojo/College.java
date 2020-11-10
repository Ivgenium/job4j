package ru.job4j.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan");
        student.setGroup("171-811 - 2019");
        student.setEntranceDate(new GregorianCalendar(2018, Calendar.JUNE, 20));
        DateFormat df = new SimpleDateFormat("dd MMM yyy", Locale.US);

        System.out.println("Student : " + student.getFullName() +
                           " studying in a group \"" + student.getGroup() +
                           "\" from " + df.format(student.getEntranceDate().getTime()));
    }
}
