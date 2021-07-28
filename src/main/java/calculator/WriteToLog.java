package calculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToLog {

    BufferedWriter writer;

    public void initiate() throws IOException {
        String fileName = "src/main/resources/results.txt";
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void getTextAndWriteToLog(String someText) throws IOException {
        writer.write(someText + System.lineSeparator());
    }
    public void flush() throws IOException {
        writer.flush();
    }

}
