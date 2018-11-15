package OOPTest;


public class Hamburger {

    private String name;
    private Bread breadRollType;
    private Meat meat;
    private Additions add1;
    private Additions add2;
    private Additions add3;
    private Additions add4;
    private boolean isCombo;
    private double price;
    private int numberOfAdditions = 0;


    public Hamburger(Bread breadRollType, Meat meat, Additions add1, Additions add2,
                     Additions add3, Additions add4, boolean isCombo, double price) {
        this.name = "Select a burger!";
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.add1 = add1;
        this.add2 = add2;
        this.add3 = add3;
        this.add4 = add4;
        this.isCombo = isCombo;

        if(add1 != null){
            numberOfAdditions++;
        }else{
            add1 = new EmptyAddition();
        }

        if(add2 != null){
            numberOfAdditions++;
        }else{
            add2 = new EmptyAddition();
        }

        if(add3 != null){
            numberOfAdditions++;
        }else{
            add3 = new EmptyAddition();
        }

        if(add4 != null){
            numberOfAdditions++;
        }else{
            add4 = new EmptyAddition();
        }

        if(isCombo){
            this.price = price + 2.00 + add1.getPrice() + add2.getPrice() + add3.getPrice() + add4.getPrice() +
            breadRollType.getPrice() + meat.getPrice();
        }else{
            this.price = price + add1.getPrice() + add2.getPrice() + add3.getPrice() + add4.getPrice()  +
                    breadRollType.getPrice() + meat.getPrice();
        }
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public Bread getBreadRollType() {
        return breadRollType;
    }


    public Meat getMeat() {
        return meat;
    }


    public Additions getAdd1() {
        return add1;
    }


    public Additions getAdd2() {
        return add2;
    }


    public Additions getAdd3() {
        return add3;
    }


    public Additions getAdd4() {
        return add4;
    }


    public boolean getIsCombo() {
        return isCombo;
    }

    public void showPriceBreakdown(){

        if(isCombo){
            System.out.println("\n\nOrder breakdown: " +
                    "\n-----------------------" +
                    "\n" + breadRollType.getName() + ": price = $" + String.format("%.2f", breadRollType.getPrice()) +
                    "\n" + meat.getName() + ": price = $" + String.format("%.2f", meat.getPrice()) +
                    "\n" + add1.getName() + ": price = $" + String.format("%.2f", add1.getPrice()) +
                    "\n" + add2.getName() + ": price = $" + String.format("%.2f", add2.getPrice()) +
                    "\n" + add3.getName() + ": price = $" + String.format("%.2f", add3.getPrice()) +
                    "\n" + add4.getName() + ": price = $" + String.format("%.2f", add4.getPrice()) +
                    "\nCombo - (small fries, small Coke): price = $2.00" +
                    "\n___________________________________________________" +
                    "\nTotal price = $" + String.format("%.2f", this.price));
        }else{
            System.out.println("\n\nOrder breakdown: " +
                    "\n-----------------------" +
                    "\n" + breadRollType.getName() + ": price = $" + String.format("%.2f", breadRollType.getPrice()) +
                    "\n" + meat.getName() + ": price = $" + String.format("%.2f", meat.getPrice()) +
                    "\n" + add1.getName() + ": price = $" + String.format("%.2f", add1.getPrice()) +
                    "\n" + add2.getName() + ": price = $" + String.format("%.2f", add2.getPrice()) +
                    "\n" + add3.getName() + ": price = $" + String.format("%.2f", add3.getPrice()) +
                    "\n" + add4.getName() + ": price = $" + String.format("%.2f", add4.getPrice()) +
                    "\n___________________________________________" +
                    "\nTotal price = $" + String.format("%.2f", this.price));
        }
    }
}
