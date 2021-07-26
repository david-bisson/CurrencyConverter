import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Runner {

    static void run() throws InterruptedException, IOException {
        ArrayList<Double> results = new ArrayList<>();

        System.out.println("Please choose an option (1/2/3):");
//        TimeUnit.SECONDS.sleep(3);
        //System.out.close();
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        System.out.println("3. Shekels to EURO");

        Scanner choice = new Scanner(System.in);
        int convChosen = choice.nextInt();

        Scanner scanner = null;
        if (convChosen == 1 || convChosen == 2 || convChosen == 3) {
            CoinFactory coinFactory = new CoinFactory();
            scanner = new Scanner(System.in);
            switch (convChosen) {
                case 1:
//                CoinFactory coinFactory = new CoinFactory();
                    coinFactory.getCoinInstance(Coins.USD);
                    System.out.println("You have chosen to Convert Dollars to Shekels");
                    System.out.println("Please enter an amount to convert");
//                Scanner scanner = new Scanner(System.in);
                    double input1 = scanner.nextDouble();
                    Coin usdValue = CoinFactory.getCoinInstance(Coins.USD);
                    double value1 = usdValue.calculate(input1);
                    System.out.println(value1);
                    results.add(value1);
                    WriteToLog.getTextAndWriteToLog(String.valueOf(value1));
                    break;
                case 2:
//              CoinFactory coinFactory = new CoinFactory();
                    coinFactory.getCoinInstance(Coins.ILS);
                    System.out.println("You have chosen to Convert Shekels to Dollars");
                    System.out.println("Please enter an amount to convert");
//                Scanner scanner = new Scanner(System.in);
                    double input = scanner.nextDouble();
                    Coin ilsValue = CoinFactory.getCoinInstance(Coins.ILS);
                    double value = ilsValue.calculate(input);
                    System.out.println(value);
                    results.add(value);
                    WriteToLog.getTextAndWriteToLog(String.valueOf(value));
                    break;
                case 3:
//              CoinFactory coinFactory = new CoinFactory();
                    coinFactory.getCoinInstance(Coins.EUR);
                    System.out.println("You have chosen to Convert Shekels to EURO");
                    System.out.println("Please enter an amount to convert");
//                Scanner scanner = new Scanner(System.in);
                    double input2 = scanner.nextDouble();
                    Coin eurValue = CoinFactory.getCoinInstance(Coins.EUR);
                    double value2 = eurValue.calculate(input2);
                    System.out.println(value2);
                    results.add(value2);
                    WriteToLog.getTextAndWriteToLog(String.valueOf(value2));
                    break;

            }
            System.out.println("Do you wish to start over Y/N?");
            String input = scanner.next();
            switch (input) {
                case "Y", "y":
                    run();
                case "N", "n":

                    for (Double result : results) {
                        System.out.println(results);
                    }
                    break;
            }
        } else {
            System.out.println("You have entered an Invalid Choice");
            System.out.println("Do you wish to start over Y/N?");
            Scanner s1 = new Scanner(System.in);
            String s2 = s1.next();
            switch (s2) {
                case "Y", "y":
                    run();
                case "N", "n":
                    break;
            }
        }

    }

}
