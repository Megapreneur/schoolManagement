package africa.semicolon.service;

public interface StudentService {
    RegisterResponse register(RegisterRequest registerRequest);
    LoginResponse login(LoginRequest loginRequest);
    CheckScoreResponse checkResult(CheckScoreRequest checkScoreRequest);
    WriteExamResponse writeExam(WriteExamRequest examRequest);
    SubmitAssignmentResponse submitAssignment(SubmitAssignmentRequest assignmentRequest);
}
