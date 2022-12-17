package HW8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterXML extends WriteIntoFile{
    @Override
    public void FileWriter(Map<String, Double> args) {

        try(FileWriter writer = new FileWriter("file.xml", false)) {
            writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root>\n");
            for(Map.Entry<String, Double> entry: args.entrySet()) {
                writer.append("  <Student>\n");
                writer.append("    <name>" + entry.getKey() + "</name>\n");
                writer.append("    <mark>" + entry.getValue() + "</mark>\n");
                writer.append("  </Student>\n");
            }
            writer.append("</root>\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
