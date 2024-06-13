package models;

public class Student extends Person {
    private int idStudent;
    private String idClass;

    public Student(String name, String birthDate, String gender, String phoneNumber, String idClass) {
        super(name, birthDate, gender, phoneNumber);
        this.idClass = idClass;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String toCsv() {
        return this.getIdStudent() + "," +
                this.getName() + "," +
                this.getBirthDate() + "," +
                this.getGender() + "," +
                this.getPhoneNumber() + "," +
                this.getIdClass();
    }

    @Override
    public String toString() {
        return  "Mã sinh viên: " + this.getIdStudent()
                + ", Tên sinh viên: " + this.getName()
                + ", Ngày sinh: " + this.getBirthDate()
                + ", Giới tính: " + this.getGender()
                + ", Số điện thoại: " + this.getPhoneNumber()
                + ", Mã lớp học: " + this.getIdClass();
    }
}
