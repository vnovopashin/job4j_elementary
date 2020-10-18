package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Джеймс Гослинг");
        student.setGroup(12345);
        student.setReceiptDate(new Date());
        System.out.println("Студент " + student.getName() + " группа № " + student.getGroup() + " дата поступления " + student.getReceiptDate());
    }
}
