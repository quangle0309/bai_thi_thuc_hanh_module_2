package services;

import models.Student;
import repositories.StudentRepo;
import java.util.List;

public class StudentService {
    StudentRepo studentRepo = new StudentRepo();
    public void add (Student student) {
        studentRepo.add(student);
    }

    public List<Student> getAll() {
        return studentRepo.getAll();
    }

    public void remove(int id) {
        studentRepo.removeById(id);
    }

    public Student findByName(String name) {
        List<Student> students = studentRepo.getAll();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
    }
}
