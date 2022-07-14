package africa.semicolon.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Students")

public class Student {
    private String name;
    @Id
    private String id;
    private String grade;
    private double totalFees;
    private double amountPaid;
    private StudentType student;
    private Gender gender;
}
