package HW13.ui;

import HW13.data.Company;
import HW13.data.ContactMain;
import HW13.service.Add;
import HW13.service.Delete;
import HW13.service.PhoneBook;
import HW13.service.Search;

import java.util.ArrayList;
import java.util.List;

public class Presenter implements Search, Add, Delete {
    private PhoneBook modelPhoneBook;
    private ConsoleView view;

    public Presenter(PhoneBook modelPhoneBook, ConsoleView view) {
        this.modelPhoneBook = modelPhoneBook;
        this.view = view;
    }


    //    • Посмотреть список контрагентов
    public void checkList(List<ContactMain> lst) {
        view.printView(lst);
    }


    //    • Добавить контрагента
    @Override
    public void addContact() {
        System.out.println("Enter new value ");
        modelPhoneBook.getLst().add(new ContactMain(view.setName(), view.setAddress(), view.setKey(), view.setValue()));

    }

    @Override
    public void addCompany() {
        System.out.println("Enter new value for the company: ");
        modelPhoneBook.getLst().add(new Company(view.setName(), view.setAddress(), view.setKey(), view.setValue(),
                view.setCompanyName(), view.setOccupation()));

    }

    //    • Добавить новый способ связаться с контрагентом
    @Override
    public void addCommunicationMethod() {
        if(!modelPhoneBook.getLst().isEmpty()) {
            for(int i = 0; i < modelPhoneBook.getLst().size(); i++) {
                System.out.printf("%d. %s", (i + 1), modelPhoneBook.getLst().get(i));

        }
            System.out.println("Enter the sequence number of the contact to change.");
            int chose = view.getIndex();
            modelPhoneBook.getLst().get(chose).getCommunicationMethods()
                    .put(view.setKey(), view.setValue());
        }else
            System.out.println("List is empty. ");

    }

    //    • Удалить контрагента
    @Override
    public void deleteContact() {
        System.out.println("Enter the full name of the contact to delete.");
        checkList(modelPhoneBook.getLst());
        String param = view.setName();
        for (ContactMain lst : modelPhoneBook.getLst()) {
            if (lst.getName().equals(param)) {
                modelPhoneBook.getLst().remove(lst);
            }
        }
    }

    //    • Удалить способ связаться с контрагентом
    @Override
    public void deleteCommunicationMethod() {
        if (!modelPhoneBook.getLst().isEmpty()) {
            for (int i = 0; i < modelPhoneBook.getLst().size(); i++) {
                System.out.printf("%d. %s", (i + 1), modelPhoneBook.getLst().get(i));

            }
            System.out.println("Enter the sequence number of the contact to change. ");
            int chose = view.getIndex();
            modelPhoneBook.getLst().get(chose).getCommunicationMethods().remove(view.setKey());
        }else System.out.println("List is empty. ");
    }

    //    • Найти контрагента по названию. Посмотреть подробную информацию о нём
    @Override
    public void search() {
        System.out.println("Enter the name to find: ");
        List<ContactMain> lstTemp = new ArrayList<>();
        String param = view.getName();
        for(ContactMain lst: modelPhoneBook.getLst()) {
            if(lst.getName().equals(param)) {
                lstTemp.add(lst);
            }
            }
        System.out.println(lstTemp);
        }
}
