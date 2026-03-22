package DZ3;

class CafeTest {
    public static void main(String[] args) {

        Beverage order = new Espresso();
        order = new Milk(order);
        order = new Sugar(order);
        order = new WhippedCream(order);

        System.out.println(order.getDescription());
        System.out.println("Total cost: $" + order.cost());

        System.out.println("-----");

        Beverage order2 = new Latte();
        order2 = new Caramel(order2);
        order2 = new Milk(order2);

        System.out.println(order2.getDescription());
        System.out.println("Total cost: $" + order2.cost());
    }
}
