package DZ3;

class WhippedCream extends BeverageDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    public double cost() {
        return beverage.cost() + 0.7;
    }
}
