package gr.codehub.Shop.f1;

public class Main {
    public static void main(String[] args) {
      /*  Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x3 = new Product(3, "Chair. Luis XV", 100, 1000);
        Product x4 = new Product(4, "Vase. Cubic", 500, 5000);
        SimpleRetailStore simple= new SimpleRetailStore();
        simple.buy(x1); simple.buy(x3); simple.sell(x1);
        System.out.println(simple.getRevenue());
        simple.sell(x2);
        System.out.println(simple.getRevenue());*/

        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200,
                                    2000);
        Product x3 = new Product(3, "Chair. Luis XV", 100, 1000);
        Product x4 = new Product(4, "Vase. Cubic", 500, 5000);


        InventoryRetailStore invStore= new InventoryRetailStore();
        invStore.setCashMoney(150.);


        invStore.buy(x1); invStore.buy(x3); invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2);
        System.out.println( invStore.getInventory());

    }
}
