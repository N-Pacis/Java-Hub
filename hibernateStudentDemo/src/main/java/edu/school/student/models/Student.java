package edu.school.student.models;

import edu.school.student.enums.EGender;

import javax.persistence.*;

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

    private EGender gender;

    public Student() {
    }

    public Student(Long id) {
        this.id = id;
    }

    public Student(Long id, String firstname, String lastname, String yearEnrolled,EGender gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearEnrolled = yearEnrolled;
        this.gender = gender;
    }

    public Student(String firstname, String lastname, String yearEnrolled,EGender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearEnrolled = yearEnrolled;
        this.gender = gender;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
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
