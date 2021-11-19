package enumerations;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    
    // public Person(String fname,String lname, Integer age, Gender gender){
    //     this.firstName = fname;
    //     this.lastName = lname;
    //     this.age = age;
    //     this.gender = gender;
    // }
    // public Person(){}
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
