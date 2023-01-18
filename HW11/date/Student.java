package HW11.date;

import java.util.List;

public class Student {
    private String surname;
    private String name;
    private AttendanceLog attandance;

    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
        attandance = new AttendanceLog();
    }

    public float attInPercents() { // Считает успеваемость в процентах
        List<Pair> copy = attandance.getPairsList();
        int count = 0;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i).getIsAttendance().equals(true)) {
                count++;
            }
        }
        return 100 / copy.size() * count;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + attInPercents();
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public AttendanceLog getAttandance() {
        return attandance;
    }

}
