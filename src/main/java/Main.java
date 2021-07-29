import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        WriteToLog.fileFlush();
        System.out.println("Welcome to currency converter");
        Runner.run();
        System.out.println("Thanks for using our currency converter");
    }
}
