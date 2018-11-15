package OOPTest;


public class Meat {

    private String name;
    private double price;


    public Meat(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public String meatDescription(){
        return "We have the best meats in town!";
    }
}



class GroundChuck extends Meat{


    public GroundChuck() {
        super("Ground Chuck", 2.00);
    }

    @Override
    public String meatDescription() {
        return "Traditional burger meat. Juicy, tasty and \"BEEFY\"!!!";
    }
}



class Turkey extends Meat{


    public Turkey() {
        super("Turkey", 2.25);
    }

    @Override
    public String meatDescription() {
        return "Turkey is the best! Healthy and sweet!";
    }
}



class Buffalo extends Meat{


    public Buffalo() {
        super("Buffalo", 2.50);
    }

    @Override
    public String meatDescription() {
        return "Buffalo meat!! A little tough, but delicious!";
    }
}








