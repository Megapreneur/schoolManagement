package africa.semicolon.Dto.Requests;

import africa.semicolon.data.model.Gender;
import africa.semicolon.data.model.StudentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String name;
    private String stateOfOrigin;
    private Gender gender;
    private int age;
    private String grade;
    private StudentType studentType;
    private String dob;
    private String email;
    private String password;
    private double amountPaid;
}
