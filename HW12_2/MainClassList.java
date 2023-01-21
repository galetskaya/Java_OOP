package HW12_2;

import java.util.LinkedList;

public abstract class MainClassList<T>{

    LinkedList<T> lst;

    public MainClassList(LinkedList<T> lst) {
        this.lst = lst;
    }

    public abstract void getSize();

    public abstract void get(int i);
}
