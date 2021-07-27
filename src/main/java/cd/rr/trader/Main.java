package cd.rr.trader;

public class Main {

    public static void main(String[] args) {
        // Your solution here
    StockPortfolio portfolio = new StockPortfolio(100, 100, 0.0);
    portfolio.transfer(100,100);
    portfolio.transfer(120, 220);
    portfolio.applyChange(220, 0.5);
    portfolio.transfer(-220, 0);
    portfolio.applyChange(0, -0.10);
    portfolio.transfer(220, 220);
    portfolio.applyChange(220, 0.5);


    }

}
