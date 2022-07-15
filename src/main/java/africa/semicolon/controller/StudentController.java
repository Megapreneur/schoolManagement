package africa.semicolon.controller;

import africa.semicolon.Dto.Requests.LoginRequest;
import africa.semicolon.Dto.Requests.RegisterRequest;
import africa.semicolon.Dto.Response.LoginResponse;
import africa.semicolon.Dto.Response.RegisterResponse;
import africa.semicolon.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student/register")
    public RegisterResponse register(@RequestBody RegisterRequest registerRequest){
        return studentService.register(registerRequest);
    }
    @PostMapping("/student/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return studentService.login(loginRequest)
    }
}
