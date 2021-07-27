package calculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        UserInterface userInterface = new UserInterface();
        userInterface.printWelcome();
        List<Double> results = new ArrayList();
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.initiate();


        String startOver = "Y";
        while (startOver.equals("Y") || startOver.equals("y")) {
            int userChoice = userInterface.getUserChoice();
            double amount = userInterface.getAmount();
            Coins coins = Coins.getEnumByUserChoice(userChoice);
            if (coins != null) {
                double convertedAmount = calculatorService.calculate(amount, coins);
                results.add(convertedAmount);
            } else {
                System.out.println("Invalid coin");
            }
            startOver = userInterface.startOverUSerChoice();
        }
        System.out.println(results);
        calculatorService.flush();
        userInterface.thanksMessage();
    }


}
