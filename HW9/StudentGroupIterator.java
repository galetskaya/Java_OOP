package HW9;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student>{

    private int index = -1;
    private StudentsGroup sg;

    

    public StudentGroupIterator(StudentsGroup sg) {
        this.sg = sg;
    }

    @Override
    public boolean hasNext() {
       return index < sg.getLength() - 1;
    }

    @Override
    public Student next() {
        return sg.get(++index);
    }

    
}
