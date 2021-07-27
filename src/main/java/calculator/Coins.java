package calculator;

public enum Coins {

    USD(1),
    ILS(2),
    EUR(3);

    int userChoice;
    Coins(int userChoice) {
        this.userChoice = userChoice;
    }

    public static Coins getEnumByUserChoice(int userChoice) {
        for (Coins e : values()) {
            if (e.userChoice == userChoice) {
                return e;
            }
        }
        return null;
    }
}
