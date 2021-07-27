import com.infra.Coin;
import com.infra.CoinFactory;
import com.infra.Coins;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    static void run() throws InterruptedException, IOException {
        ArrayList<String> results = new ArrayList<>();

        System.out.println("Please choose an option (1/2/3):");
//        TimeUnit.SECONDS.sleep(3);
        //System.out.close();
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        System.out.println("3. Shekels to EURO");


        Scanner choice = new Scanner(System.in);
        int convChosen = choice.nextInt();


        Scanner scanner = null;

            CoinFactory coinFactory = new CoinFactory();
            scanner = new Scanner(System.in);
            switch (convChosen) {
                case 1:
                    coinFactory.getCoinInstance(Coins.ILS);
                    System.out.println("You have chosen to Convert Dollars to Shekels");
                    System.out.println("Please enter an amount to convert");
                    double input1 = scanner.nextDouble();
                    Coin usdValue = CoinFactory.getCoinInstance(Coins.ILS);
                    double value1 = usdValue.calculate(input1);
                    System.out.println(input1 + " Dollar/s are " +value1+" Shekels");
                    results.add(value1+", USD to ILS");
                    WriteToLog.getTextAndWriteToLog(value1+", USD to ILS");

                    break;
                case 2:
                    coinFactory.getCoinInstance(Coins.USD);
                    System.out.println("You have chosen to Convert Shekels to Dollars");
                    System.out.println("Please enter an amount to convert");
                    double input = scanner.nextDouble();
                    Coin ilsValue = CoinFactory.getCoinInstance(Coins.USD);
                    double value = ilsValue.calculate(input);
                    System.out.println(input + " Shekels are " +value+" Dollar/s");
                    results.add(value+", ILS to USD");
                    WriteToLog.getTextAndWriteToLog(value+", ILS to USD");
                    break;
                case 3:
                    coinFactory.getCoinInstance(Coins.EUR);
                    System.out.println("You have chosen to Convert Shekels to EURO");
                    System.out.println("Please enter an amount to convert");
                    double input2 = scanner.nextDouble();
                    Coin eurValue = CoinFactory.getCoinInstance(Coins.EUR);
                    double value2 = eurValue.calculate(input2);
                    System.out.println(input2 + " Shekels are " +value2+" Dollar/s");
                    results.add(value2+", ILS to EUR");
                    WriteToLog.getTextAndWriteToLog(value2+", ILS to EUR");
                    break;
                default:
                    System.out.println("Invalid Choice, please start over");
                    run();
            }

            System.out.println("Do you wish to start over Y/N?");
            String input = scanner.next();

            switch (input) {
                case "Y", "y":
                    run();
                case "N", "n":

                    for (String result : results) {
                        System.out.println(results);
                    }
                    openFile();
                    break;
                default:

                    System.out.println("Invalid Choice, please start over");
                    run();

            }

    }
    static void openFile(){
        try
        {
//constructor of file class having file as argument
            File file = new File("src/main/resources/results.txt");
            if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())         //checks file exists or not
                desktop.open(file);              //opens the specified file
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
