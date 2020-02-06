package gr.codehub.Shop.f1;

public interface IShop<T>{
    Boolean sell(T tau);
    Boolean buy(T tau);
    Double getRevenue();
}
