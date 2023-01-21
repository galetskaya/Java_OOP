package HW12_2;

import java.util.LinkedList;
import java.util.List;

public class ImmutableList extends MainClassList<Integer>{

    public ImmutableList(LinkedList<Integer> lst) {
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


}
