package HW11;

import java.util.ArrayList;
import java.util.List;

import HW11.date.Student;

public class Controller { // Presenter
    AttandanceService aService;
    AttandanceView aView;

    public Controller() {
        this.aService = new AttandanceService();
        this.aView = new AttandanceView();
    }

    public List<Student> getsGroup() { // Создается и возвращается список студентов, в котором все студенты и их
                                       // посещаемость в %
        List<Student> copy = new ArrayList<>();
        copy = aService.getsGroup();
        List<Student> studentsList = new ArrayList<>();
        for (Student student : copy) {
            studentsList.add(student);
        }
        return studentsList;
    }

    public List<Student> sortStudensGroup() { // Список студентов сортируется по уменьшению %-та посещаемости и
                                              // возвращается
        List<Student> copy = new ArrayList<>();
        copy = aService.getsGroup();
        Student temp;
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = i + 1; j < copy.size(); j++) {
                if (copy.get(i).attInPercents() < copy.get(j).attInPercents()) {
                    temp = copy.get(j);
                    copy.set(j, copy.get(i));
                    copy.set(i, temp);
                }
            }
        }
        return copy;
    }

    public List<Student> filterStudents(float param) { // Студенты фильтруются по заданному параметру
        List<Student> copy = new ArrayList<>();
        copy = aService.getsGroup();
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i).attInPercents() <= param) {
                result.add(copy.get(i));
            }
        }
        return result;

    }

    public AttandanceService getaService() {
        return aService;
    }

    public AttandanceView getaView() {
        return aView;
    }

}
