package cd.rr.trader;

public class StockPortfolio extends Main {
    double value;
    static int transferFee = 10;
    int amount;
    double percentage;

    public double getValue(StockPortfolio portfolio) {
        return value;
    }

    public void setAmount(int amount) {
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }

    public void transfer(int amount , double value){
        amount = (int) (amount + value);
    }
    public void applyChange(double value, double percentage){
        value = value * percentage;
    }

    public StockPortfolio(int amount,double value, double percentage) {
        this.amount = amount;
        this.value = value;
        this.percentage = percentage;
    }


}

