package HW8;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<String, Double> dict = new HashMap<>();
        dict.put("Иван Иванов", 4.8);
        dict.put("Мария Кузнецова", 5.0);
        dict.put("Степан Кузьмин", 3.6);

        WriterTXT file1 = new WriterTXT();
        file1.FileWriter(dict);

        WriterXML file2 = new WriterXML();
        file2.FileWriter(dict);

        WriterJSON file3 = new WriterJSON();
        file3.FileWriter(dict);

    }
}
