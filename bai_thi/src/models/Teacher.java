package models;

public class Teacher extends Person {
    private String idTeacher;

    public Teacher(String idTeacher, String name, String birthDate, String gender, String phoneNumber) {
        super(name, birthDate, gender, phoneNumber);
        this.idTeacher = idTeacher;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return  "Mã sinh viên: " + this.getIdTeacher()
                + super.toString();
    }
}
