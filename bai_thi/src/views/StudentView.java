package views;

import common.ExceptionHandler;
import common.RegexHandler;
import models.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner sc = new Scanner(System.in);

    public void viewMessage(String string) {
        System.out.println(string);
    }

    public int viewMenuStudent() {
        System.out.println("\n-----------Menu------------\n");
        System.out.println("1. Thêm mới sinh viên");
        System.out.println("2. Xóa sinh viên");
        System.out.println("3. Xem danh sách sinh viên");
        System.out.println("4. Tìm kiếm sinh viên");
        System.out.println("0. Thoát");
        System.out.print("Chọn chức năng: ");

        int choice;
        do {
            choice = ExceptionHandler.checkChoice();
            if (choice < 0 || choice > 5) {
                System.err.println("Lựa chọn không khả dụng!!!\n");
            } else {
                return choice;
            }
        } while (true);
    }

    public Student viewAdd() {
        do {
            System.out.println("\n----------Add-----------\n");
            System.out.print("Tên sinh viên: ");
            String name = sc.nextLine();
            if (!RegexHandler.isValidName(name)) {
                System.out.println("Tên không hợp lệ!");
                continue;
            }
            System.out.print("Ngày sinh: ");
            String birthDate = sc.nextLine();
            if (!RegexHandler.isValidDate(birthDate)) {
                System.out.println("Sai định dạng!");
                continue;
            }
            System.out.print("Giới tính: ");
            String gender = sc.nextLine();
            System.out.print("Số điện thoại: ");
            String phoneNumber = sc.nextLine();
            if (!RegexHandler.isValidPhoneNumber(phoneNumber)) {
                System.out.println("Số điện thoại không hợp lệ!");
                continue;
            }
            System.out.print("Mã lớp học: ");
            String idClass = sc.nextLine();
            return new Student(name, gender, birthDate, phoneNumber, idClass);
        }while (true);
    }

    public void displayAllStudent(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Không có sinh viên!\n");
        } else {
            System.out.println("Danh sách sinh viên:\n");
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }

    public int viewRemove() {
        return ExceptionHandler.checkId();
    }

    public boolean confirmRemove() {
        do {
            System.out.println("Xác nhận xóa nhấn 'Y', hủy bỏ nhấn 'N'!");
            String confirm = sc.nextLine();
            confirm = confirm.toUpperCase();
            if (confirm.equals("Y")) {
                return true;
            } else if (confirm.equals("N")) {
                return false;
            } else {
                System.out.println("Vui lòng nhập chính xác lựa chọn!!!");
            }
        } while (true);
    }

    public String viewSearch() {
        System.out.print("Nhập vào tên cần tìm: ");
        return sc.nextLine();
    }
}
