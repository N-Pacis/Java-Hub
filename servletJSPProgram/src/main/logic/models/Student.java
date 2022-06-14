package models;

import javax.persistence.*;
//import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;
    private String lastname;

    @Column(name = "year_enrolled")
    private String yearEnrolled;

    public Student() {
    }

    public Student(Long id, String firstname, String lastname, String yearEnrolled) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearEnrolled = yearEnrolled;
    }

    public Student(String firstname, String lastname, String yearEnrolled) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearEnrolled = yearEnrolled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(String yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

}
