package Model;

public class Grade {
    private int ID;
    private Course course;
    private Class c;
    private Student student;
    private Double grade;
    private Double max;

    public Grade(){}

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public Class getC() {
        return c;
    }
    public void setC(Class c) {
        this.c = c;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Double getGrade() {
        return grade;
    }
    public void setGrade(Double grade) {
        this.grade = grade;
    }
    public Double getMax() {
        return max;
    }
    public void setMax(Double max) {
        this.max = max;
    }

}
