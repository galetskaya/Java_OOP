package HW9;

import java.util.Iterator;
// import java.util.ListIterator;

public class ReverseIterator implements Iterator<Student> {

    private StudentsGroup sg;
    public int index;

    public ReverseIterator(StudentsGroup sg) {
        this.sg = sg;
        this.index = sg.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return sg.get(index--);
    }

    public int getIndex() {
        return this.index;
    }

}
