package africa.semicolon.data.model;

import lombok.Data;

@Data

public class Student {

    private String name;
    private String id;
    private String grade;
    private double totalFees;
    private double amountPaid;
    private StudentType student;
}
