package repositories;

import models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    private final String SRC_STUDENT_FILE = "src/data/students.csv";

    public void add(Student student) {
        List<Student> students = getAll();
        student.setIdStudent(countId());
        students.add(student);
        writeFile(students, false);
    }


    public void removeById(int id) {
        List<Student> students = getAll();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdStudent() == id) {
                students.remove(i);
                System.out.println("Xóa thành công!");
                break;
            }
        }
        writeFile(students, false);
    }

    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        File file = new File(SRC_STUDENT_FILE);
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                student = new Student(temp[1], temp[2], temp[3], temp[4], temp[5]);
                student.setIdStudent(Integer.parseInt(temp[0]));
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println(SRC_STUDENT_FILE);
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Lỗi đóng file");
                }
            }
        }
        return students;
    }

    public int countId() {
        File file = new File(SRC_STUDENT_FILE);
        int count = 1;
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null) {
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!!!");
        } catch (IOException e) {
            System.err.println("Lỗi đọc dữ liệu!!!");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Lỗi đóng file!!!");
                }
            }
        }
        return count;
    }

    private void writeFile(List<Student> students, boolean append) {
        File file = new File("src/data/students.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student element : students) {
                bufferedWriter.write(element.toCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Lỗi ghi file");
            System.out.print("\n");
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.err.println("Lỗi đóng file");
                    System.out.print("\n");
                }
            }
        }
    }
}
