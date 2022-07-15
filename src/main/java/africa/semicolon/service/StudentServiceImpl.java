package africa.semicolon.service;

import africa.semicolon.Dto.Requests.*;
import africa.semicolon.Dto.Response.*;
import africa.semicolon.data.model.Student;
import africa.semicolon.data.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        Student student = new Student();
        student.setName(registerRequest.getName());
        student.setDob(registerRequest.getDob());
        student.setAge(registerRequest.getAge());
        student.setEmail(registerRequest.getEmail());
        student.setGender(registerRequest.getGender());
        student.setAmountPaid(registerRequest.getAmountPaid());
        student.setPassword(registerRequest.getPassword());
        student.setStateOfOrigin(registerRequest.getStateOfOrigin());
        student.setGrade(registerRequest.getGrade());
        student.setStudent(registerRequest.getStudentType());
        String studentID = String.valueOf(UUID.randomUUID().getMostSignificantBits());
        studentID = "ST" + studentID.substring(1, 4);
        student.setStudentID(studentID);

        Student savedStudent = studentRepository.save(student);

        RegisterResponse response = new RegisterResponse();
        response.setMessage(savedStudent.getName() + " Welcome to Quintessential College. your student ID is "
                + savedStudent.getStudentID());
        return response;
    }
    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        Optional<Student> newStudent = studentRepository.findByStudentID(loginRequest.getStudentID());
        if(newStudent.isPresent()){
            if (newStudent.get().getPassword().equals(loginRequest.getPassword())){
                LoginResponse loginResponse = new LoginResponse();
                loginResponse.setMessage();
            }
        }



        return null;
    }

    @Override
    public CheckScoreResponse checkResult(CheckScoreRequest checkScoreRequest) {
        return null;
    }

    @Override
    public WriteExamResponse writeExam(WriteExamRequest examRequest) {
        return null;
    }

    @Override
    public SubmitAssignmentResponse submitAssignment(SubmitAssignmentRequest assignmentRequest) {
        return null;
    }
}
