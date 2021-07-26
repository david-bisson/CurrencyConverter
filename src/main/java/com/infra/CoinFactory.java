package com.infra;

import com.infra.Coin;
import com.infra.Coins;

public class CoinFactory {

    public static Coin getCoinInstance(Coins coin) {


        switch (coin) {

            case ILS:
                return new ILS();
            case USD:
                return new USD();
            case EUR:
                return new EUR();
        }


        return null;
    }
}

