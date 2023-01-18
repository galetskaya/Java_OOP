package HW11;

import java.util.List;

import HW11.date.*;

public class AttandanceService { // База данных, хранилище всех данных студентов "Model", должна быть с
                                 // обобщением, чтобы можно было использовать не только с группой студентов
    private StudentsGroup sGroup = new StudentsGroup();

    public AttandanceService() {
        sGroup.addStudentInGroup(new Student("Ivanov", "Vasiliy"));
        sGroup.addStudentInGroup(new Student("Petrov", "Evklid"));
        sGroup.addStudentInGroup(new Student("Amarov", "Karen"));
        sGroup.addStudentInGroup(new Student("Kluny", "Djorge"));
        sGroup.addStudentInGroup(new Student("Sean", "Poll"));
    }

    @Override
    public String toString() {
        return sGroup.toString();
    }

    public List<Student> getsGroup() { // получение списка группы студентов
        List<Student> copyStudentsGroup = sGroup.getStList();
        return copyStudentsGroup;
    }

}
