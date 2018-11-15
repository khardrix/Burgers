package OOPTest;


abstract class Sides {

    private String name;
    private double price;


    public Sides(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    abstract String sidesDescription();
}
