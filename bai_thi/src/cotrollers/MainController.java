package cotrollers;

import services.StudentService;
import views.StudentView;
import models.Student;
import java.util.List;

public class MainController {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentService service = new StudentService();
        Student student;
        List<Student> students;
        int choice;
        while (true) {
            choice = view.viewMenuStudent();
            switch (choice) {
                case 1:
                    student = view.viewAdd();
                    service.add(student);
                    view.viewMessage("Thêm mới thành công!");
                    break;
                case 2:
                    int id = view.viewRemove();
                    if (view.confirmRemove()) {
                        service.remove(id);
                    } else {
                        view.viewMessage("Đã hủy thao tác!");
                    }
                    break;
                case 3:
                    students = service.getAll();
                    view.displayAllStudent(students);
                    break;
                case 4:
                    String name = view.viewSearch();
                    student = service.findByName(name);
                    view.viewMessage(student.toString());
                    break;
                case 0:
                    return;
            }
        }
    }
}
