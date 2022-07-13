package africa.semicolon.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String name;
    @Id
    private String id;
    private String grade;
    private double totalFees;
    private double amountPaid;
    private StudentType student;
}
