package gr.codehub.Shop.f1;

public class SimpleRetailStore extends Shop{
    private double totalBuyBalance;
    private double totalSellBalance;

    public SimpleRetailStore(){
    }

    public double getTotalBuyBalance() {
        return totalBuyBalance;
    }

    public void setTotalBuyBalance(double totalBuyBalance) {
        this.totalBuyBalance = totalBuyBalance;
    }

    public double getTotalSellBalance() {
        return totalSellBalance;
    }

    public void setTotalSellBalance(double totalSellBalance) {
        this.totalSellBalance = totalSellBalance;
    }

    @Override
    public Boolean sell(Product tau) {
        totalSellBalance += tau.getPriceWhenSell();
        return true;
    }

    @Override
    public Boolean buy(Product tau) {
        totalBuyBalance += tau.getPriceWhenBuy();
        return true;
    }

    @Override
    public Double getRevenue() {
        return totalSellBalance;
    }

}
