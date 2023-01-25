package HW13.ui;


import java.util.Map;

public interface View {

    String getName();
    String setName();

    Map<String, String> getCommunicationMethods();
    String setKey();
    String setValue();

    String getAddress();
    String setAddress();

    String getCompanyName();
    String setCompanyName();

    String getOccupation();
    String setOccupation();

}
