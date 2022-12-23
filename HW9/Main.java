package HW9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("Ivan", 23, 4.1f));
        lst.add(new Student("Petr", 21, 3.5f));
        lst.add(new Student("Nina", 25, 2.0f));
        lst.add(new Student("Vasia", 19, 4.7f));

        // Create the list of students type StudentsGroup
        StudentsGroup sg = new StudentsGroup(lst);

        // Create iterator object
        Iterator<Student> it = sg.iterator();

        // With iterator print students into console
        while(it.hasNext()){
            System.out.println(it.next());
        }
        

        System.out.println("------------------------------");

        // Create ListIterator Object
        ListIterator<Student> listIt = sg.listIterator();

        // Print students left>right
        while(listIt.hasNext()){
            System.out.println(listIt.nextIndex() + "\n" + listIt.next());
        }

        System.out.println("---------------------------");
        ListIterator<Student> listIt2 = sg.listIterator();

        // Print students right>left
        while(listIt2.hasPrevious()){
            System.out.println("Index is: " + listIt2.previousIndex() +  "\n" + listIt2.previous() + "\n" );
        }

        System.out.println("---------------------------");

        //Print reverse method
        ReverseIterator rt = new ReverseIterator(sg);
        while(rt.hasNext()) {
            System.out.println("Index is: " + rt.getIndex() + "\n" + rt.next());
        }
    }
}