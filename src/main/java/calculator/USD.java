package calculator;

import java.io.Serializable;

public class USD extends Coin implements Serializable {

   private final double value = 3.52;
    private double input;


    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double value) {
        input = value;
        return input * getValue();
    }
}
