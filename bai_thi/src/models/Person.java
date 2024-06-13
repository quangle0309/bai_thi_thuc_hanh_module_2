package models;

public abstract class Person {
    private String name;
    private String birthDate;
    private String gender;
    private String phoneNumber;

    public Person(String name, String birthDate, String gender, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return  "Tên: " + this.getName()
                + ", Ngày sinh: " + this.getBirthDate()
                + ", Giới tính: " + this.getGender()
                + ", Số điện thoại: " + this.getPhoneNumber();
    }
}
