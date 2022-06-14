package serviceImpl;

import models.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import services.StudentService;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(Student student) throws SQLException {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        }
        catch(Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> listAllStudents() {
        Transaction transaction = null;
        List<Student> students = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            students = session.createQuery("from Student").getResultList();
            transaction.commit();
        }
        catch(Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return  students;
    }

    @Override
    public boolean deleteStudent(Long id) throws SQLException {
        return false;
    }

    @Override
    public void updteStudent() {

    }
}
