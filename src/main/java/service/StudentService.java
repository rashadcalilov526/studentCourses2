package service;

import lombok.RequiredArgsConstructor;
import model.Student;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Optional<Student> getStudent(Integer id){
        var student=studentRepository.findById(id);
        return student;
    }
    public void save(Student student){
        studentRepository.save(student);
    }
    public void delete(Student student){
        studentRepository.delete(student);
    }
    public void update(Integer id, Student student) {

       studentRepository.save(student);
    }
    public List<Student> getAllStudent()
    {
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(students1 -> students.add(students1));
        return students;
    }
    public Student getStudentById(Integer id)
    {
        return studentRepository.findById(id).get();
    }
}
