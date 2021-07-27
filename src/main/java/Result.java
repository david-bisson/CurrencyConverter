public class Result {

    double coinValue;
    String conversion;

    public Result(double coinValue, String conversion) {
        this.coinValue = coinValue;
        this.conversion = conversion;
    }

    public Result() {

    }

    public double getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(double coinValue) {
        this.coinValue = coinValue;
    }

    public String getConversion() {
        return conversion;
    }

    public void setConversion(String conversion) {
        this.conversion = conversion;
    }
}
