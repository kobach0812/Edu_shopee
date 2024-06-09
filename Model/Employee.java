package Model;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String birthDate;
    private Double Salary;
    private Department department;
    private String password;

    public Employee(){}

    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public Double getSalary(){
        return Salary;
    }
    public void setSalary(Double salary){
        Salary = salary;
    }

    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
