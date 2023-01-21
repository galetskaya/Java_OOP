package HW12_2;

import java.util.LinkedList;
import java.util.List;

public class MutableList extends MainClassList<Integer>{

    public MutableList(LinkedList<Integer> lst) {
        super(lst);
    }

    @Override
    public void getSize() {
        System.out.println(lst.size());
    }

    @Override
    public void get(int i) {
        System.out.println(lst.get(i));
    }

    public void set (int i, int newValue) {
        lst.set(i, newValue);
        System.out.println(lst);
    }

    public void add(int newValue) {
        lst.add(newValue);
        System.out.println(lst);
    }

    public void remove(int value) {
        lst.remove(value);
        System.out.println(lst);
    }

    @Override
    public String toString() {
        return "MutableList{" +
                "lst=" + lst +
                '}';
    }
}
