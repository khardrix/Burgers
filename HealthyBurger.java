package OOPTest;


public class HealthyBurger extends Hamburger{

    private Additions add5;
    private Additions add6;


    public HealthyBurger(Additions add1, Additions add2, Additions add3,
                         Additions add4, Additions add5, Additions add6, boolean isCombo, double price) {
        super(new BrownRye(), new Turkey(), add1, add2, add3, add4, isCombo, price);

        if(add5 != null){
            this.add5 = add5;
        }else{
            this.add5 = new EmptyAddition();
        }

        if(add6 != null){
            this.add6 = add6;
        }else{
            this.add6 = new EmptyAddition();
        }

        if(add5 != null && add6 != null){
            super.setPrice(super.getPrice() + add5.getPrice() + add6.getPrice());
        }else if(add5 == null && add6 != null){
            super.setPrice(super.getPrice() + add6.getPrice());
        }else if(add5 != null){
            super.setPrice(super.getPrice() + add5.getPrice());
        }
    }


    public Additions getAdd5() {
        return add5;
    }


    public Additions getAdd6() {
        return add6;
    }

    @Override
    public void showPriceBreakdown() {

        if (super.getIsCombo()) {
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
                    "\n" + add5.getName() + ": price = $" + String.format("%.2f", add5.getPrice()) +
                    "\n" + add6.getName() + ": price = $" + String.format("%.2f", add6.getPrice()) +
                    "\nCombo - (small fries, small Coke): price = $2.00" +
                    "\n___________________________________________________" +
                    "\nTotal price = $" + String.format("%.2f", super.getPrice()));
        } else {
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
                    "\n" + add5.getName() + ": price = $" + String.format("%.2f", add5.getPrice()) +
                    "\n" + add6.getName() + ": price = $" + String.format("%.2f", add6.getPrice()) +
                    "\n___________________________________________" +
                    "\nTotal price = $" + String.format("%.2f", super.getPrice()));
        }
    }
}
