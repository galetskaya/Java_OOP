package HW9;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {

    private int index = 0;
    private StudentsGroup sg;

    public GroupListIterator(StudentsGroup sg) {
        this.sg = sg;
    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean hasNext() {
        return index < sg.getLength();
    }

    @Override
    public boolean hasPrevious() {
        return sg.getLength() - 1 - index >= 0;
    }

    @Override
    public Student next() {
        return sg.get(index++);
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public Student previous() {
        return sg.get(sg.getLength() - 1 - index++);
    }

    @Override
    public int previousIndex() {
        return sg.getLength() - 1 - index;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub

    }

}
