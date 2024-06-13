package models;

public class Class {
    private String idClass;
    private String nameClass;
    private String idTeacher;

    public Class(String idClass, String nameClass, String idTeacher) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.idTeacher = idTeacher;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }
}
