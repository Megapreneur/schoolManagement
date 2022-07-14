package africa.semicolon.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Document("School")

public class Student {
    @NonNull
    private String name;
    @Id
    private String id;
    @NonNull
    private String grade;
    private double totalFees;
    @NonNull
    private double amountPaid;
    @NonNull
    private StudentType student;
    @NonNull
    private Gender gender;
    private String studentID;
    @NonNull
    private int age;
    @NonNull
    private String dob;
    private String password;
    @NonNull
    private String email;
    @NonNull
    private String stateOfOrigin;
}
