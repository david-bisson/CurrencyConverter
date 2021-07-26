package com.infra;

import com.infra.Coin;

import java.io.Serializable;

public class ILS extends Coin implements Serializable {

    private final double value = 0.28;
    private double input;


    @Override
    public double getValue() {
        return value;

    }

    @Override
    public double calculate(double value) {
        input = value;
        return input / getValue();
    }

}
