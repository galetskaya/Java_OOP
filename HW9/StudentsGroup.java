package HW9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentsGroup implements Iterable<Student> {

    List<Student> studentsList = new ArrayList<>();

    public StudentsGroup(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public int getLength(){
        return studentsList.size();
    }

    public Student get(int index){
        return studentsList.get(index);
    }
    

    @Override
    public String toString() {
        return "StudentsGroup [studentsList=" + studentsList + "]";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator<Student> listIterator(){
        return new GroupListIterator(this);
    }
    
    public Iterator<Student> reversIterator(){
        return new ReverseIterator(this);
    }

}
