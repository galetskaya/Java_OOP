package HW11;

import java.util.List;
import java.util.Scanner;

import HW11.date.Student;

public class App {

    Controller controller = new Controller();
    Scanner in;
    Controller con = new Controller();

    public void buttonClick() {
        try (Scanner in = new Scanner(System.in)) {
            boolean stop = true;

            while (stop) {
                System.out.println(
                        "Menu:" + "\n0 - Вывести весь список студентов с их посещаемостью"
                                + "\n1 - Вывести отсортированный по убыванию посещаемости список студентов"
                                + "\n2 - Вывести студентов по заданной посещаемости" + "\n3 - Выход"
                                + "\nВвод: ");
                switch (in.next()) {
                    case "0":
                        List<Student> lst0 = con.getsGroup();
                        con.getaView().printResult(lst0);
                        System.out.println();
                        break;
                    case "1":
                        List<Student> lst1 = con.sortStudensGroup();
                        con.getaView().printResult(lst1);
                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Введите процент посещаемости: ");
                        float percent = in.nextFloat();
                        List<Student> lst2 = con.filterStudents(percent);
                        con.getaView().printResult(lst2);
                        System.out.println();
                        break;
                    case "3":
                        stop = false;
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
