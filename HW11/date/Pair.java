package HW11.date;

import java.time.LocalDate;
import java.util.*;

// Пара дата, факт посещения. Используется для создания журнала посещаемости.
public class Pair {
    private LocalDate date;
    private Boolean isAttendance;
    Random r = new Random();

    public Pair() {
        date = LocalDate.now();
        isAttendance = r.nextBoolean();
    }

    @Override
    public String toString() {
        return "date = " + date + ", isAttendance = " + isAttendance + "\n";
    }


    public Boolean getIsAttendance() {
        return isAttendance;
    }

    

    

 

    

}
