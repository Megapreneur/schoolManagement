package africa.semicolon.Dto.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckScoreRequest {
    private String studentID;
    private int studentScore;
}
