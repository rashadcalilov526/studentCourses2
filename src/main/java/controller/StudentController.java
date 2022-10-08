package controller;

import lombok.RequiredArgsConstructor;
import model.Student;
import org.springframework.web.bind.annotation.*;
import repository.StudentRepository;
import service.StudentService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

    @PostMapping("/post")
    public Integer  newStudent(@RequestBody Student student){
        studentService.save(student);
        return student.getId();
    }
    @DeleteMapping("/delete")
    public void deleteStudent(@RequestBody Student student){
        studentService.delete(student);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
    studentService.save(student);
    return student;
    }
}
