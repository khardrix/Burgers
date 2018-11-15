package OOPTest;


public class Bread {

    private String name;
    private double price;


    public Bread(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }

    public String getBreadDescription(){
        return "Our bread rolls are baked daily. Please select which type you would like!";
    }
}



class BrownRye extends Bread{


    public BrownRye() {
        super("Brown Rye", 1.20);
    }


    @Override
    public String getBreadDescription() {
        return "A tasty brown rye roll baked to perfection! Healthy and delicious!";
    }
}



class White extends Bread{


    public White() {
        super("White", 1.00);
    }

    @Override
    public String getBreadDescription() {
        return "A soft, sweet, traditional white bread roll! Bring back your childhood!";
    }
}



class Wheat extends Bread{


    public Wheat() {
        super("Wheat", 0.80);
    }

    @Override
    public String getBreadDescription() {
        return "A better option for those trying to lose weight. Great for everyone!";
    }
}



class Italian extends Bread{


    public Italian() {
        super("Italian", 1.50);
    }

    @Override
    public String getBreadDescription() {
        return "Baked just liked in Italy! The absolute best!";
    }
}
