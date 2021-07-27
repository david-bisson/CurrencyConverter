package calculator;

public abstract class Coin implements Calculate {

    public abstract double getValue();

    @Override
    public double calculate(double value) {
        return getValue();

    }
}
