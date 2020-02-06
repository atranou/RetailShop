package gr.codehub.Shop.f1;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends Shop{
    private List<Product> products;
    private double cashMoney;
    private double totalSellBalance;

    public InventoryRetailStore(){
        products =new ArrayList<>();
    }

    public double getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(double cashMoney) {
        this.cashMoney = cashMoney;
    }

    @Override
    public Boolean sell(Product tau) {
        if (products.contains(tau)) {
            products.remove(tau);
            cashMoney += tau.getPriceWhenSell();
            totalSellBalance += tau.getPriceWhenSell();

            return true;
        }
        else {
            System.out.println("The product doesnt exit in the Inventory");
        }
            return false;
    }

    @Override
    public Boolean buy(Product tau) {
        if (tau.getPriceWhenBuy()<=cashMoney){
            cashMoney -= tau.getPriceWhenBuy();
            products.add(tau);
            return true;
        }
        else{
            System.out.println("The product costs more than your current cash");
            return false;
        }
    }

    public List<Product> getInventory(){
        return products;
    }

    public void reset(){
        products.clear();
    }

    @Override
    public Double getRevenue() {
        return totalSellBalance;
    }
}
