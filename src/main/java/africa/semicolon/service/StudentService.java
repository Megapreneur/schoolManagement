package africa.semicolon.service;

import africa.semicolon.Dto.Requests.*;
import africa.semicolon.Dto.Response.*;

public interface StudentService {
    RegisterResponse register(RegisterRequest registerRequest);
    LoginResponse login(LoginRequest loginRequest);
    CheckScoreResponse checkResult(CheckScoreRequest checkScoreRequest);
    WriteExamResponse writeExam(WriteExamRequest examRequest);
    SubmitAssignmentResponse submitAssignment(SubmitAssignmentRequest assignmentRequest);
}
