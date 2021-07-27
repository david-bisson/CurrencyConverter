package calculator;

import lombok.SneakyThrows;

import java.io.IOException;

public class CalculatorService {

    WriteToLog writeToLog = new WriteToLog();
    CoinFactory coinFactory = new CoinFactory();

    @SneakyThrows
    public void initiate() {
        writeToLog.initiate();
    }

    @SneakyThrows
    public double calculate(double amount, Coins coins) {
        Coin coin = coinFactory.getCoinInstance(coins);
        double convertedAmount = coin.calculate(amount);
        writeToLog.getTextAndWriteToLog(String.valueOf(convertedAmount));
        return convertedAmount;
    }

    public void flush() throws IOException {
        writeToLog.flush();
    }
}
