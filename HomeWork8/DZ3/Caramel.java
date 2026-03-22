package DZ3;

class Caramel extends BeverageDecorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    public double cost() {
        return beverage.cost() + 0.6;
    }
}
