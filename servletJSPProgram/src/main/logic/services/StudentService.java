package services;

import models.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    void addStudent(Student student) throws SQLException;

    List<Student> listAllStudents();

    Student getStudentById(Long id);

    boolean deleteStudent(Long id) throws SQLException;
    void updateStudent(Student student);
}
