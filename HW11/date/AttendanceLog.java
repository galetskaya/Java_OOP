package HW11.date;

import java.util.*;

// Журнал посещаемости, рандомно генерируются 7 записей в журнал
public class AttendanceLog {

    private List<Pair> pairsList = new LinkedList<>();

    public AttendanceLog() {
        for(int i = 0; i < 7; i++){
            pairsList.add(new Pair());
        }
    }

    @Override
    public String toString() {
        return pairsList.toString();
    }

    public List<Pair> getPairsList() {
        return pairsList;
    }

    

    
}

