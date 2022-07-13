package africa.semicolon.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @Id

    private String id;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String gender;
    private int age;
    private StaffType staff;
}
