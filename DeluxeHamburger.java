package OOPTest;


public class DeluxeHamburger extends Hamburger {

    private Sides fries;
    private Sides drink;


    public DeluxeHamburger(Bread breadRollType,  Sides fries, Sides drink, double price) {
        super(breadRollType, new GroundChuck(), new American(), new Mayonaisse(), new Lettuce(),
                new Tomato(), true, price);

        if(fries != null){
            this.fries = fries;
        }else{
            this.fries = new EmptySides();
        }

        if(drink != null){
            this.drink = drink;
        }else{
            this.drink = new EmptySides();
        }

        if(fries != null && drink != null){
            super.setPrice((super.getPrice() + fries.getPrice() + drink.getPrice()) - 2.00);
        }else if(fries == null && drink != null){
            super.setPrice((super.getPrice()+ drink.getPrice()) - 2.00);
        }else if(fries != null){
            super.setPrice((super.getPrice() + fries.getPrice()) - 2.00);
        }
    }


    public Sides getFries() {
        return fries;
    }


    public Sides getDrink() {
        return drink;
    }

    @Override
    public void showPriceBreakdown() {

        System.out.println("\n\nOrder breakdown: " +
                "\n-----------------------" +
                "\n" + super.getBreadRollType().getName() + ": price = $" +
                String.format("%.2f", super.getBreadRollType().getPrice()) +
                "\n" + super.getMeat().getName() + ": price = $" +
                String.format("%.2f", super.getMeat().getPrice()) +
                "\n" + super.getAdd1().getName() + ": price = $" +
                String.format("%.2f", super.getAdd1().getPrice()) +
                "\n" + super.getAdd2().getName() + ": price = $" +
                String.format("%.2f", super.getAdd2().getPrice()) +
                "\n" + super.getAdd3().getName() + ": price = $" +
                String.format("%.2f", super.getAdd3().getPrice()) +
                "\n" + super.getAdd4().getName() + ": price = $" +
                String.format("%.2f", super.getAdd4().getPrice()) +
                "\n" + fries.getName() + ": price = $" + String.format("%.2f", fries.getPrice()) +
                "\n" + drink.getName() + ": price = $" + String.format("%.2f", drink.getPrice()) +
                "\n___________________________________________________" +
                "\nTotal price = $" + String.format("%.2f", super.getPrice()));
    }
}
