package OOPTest;


public class Fries extends Sides{


    public Fries(String name, double price) {
        super(name, price);
    }

    @Override
    public String sidesDescription() {
        return "We have the very best french fries in town!";
    }
}



class CrinkleCut extends Fries{


    public CrinkleCut() {
        super("Crinkle Cut", 1.40);
    }

    @Override
    public String sidesDescription() {
        return "Fried to golden brown and purely delicious! Crinkle Cut is amazing!";
    }
}



class ShoeString extends Fries{


    public ShoeString() {
        super("Shoe String", 1.10);
    }

    @Override
    public String sidesDescription() {
        return "Fun for kids or all ages. Everyone loves shoe strings!";
    }
}



class SteakFries extends Fries{


    public SteakFries() {
        super("Steak Fries", 1.85);
    }

    @Override
    public String sidesDescription() {
        return "Thick, bold and delicious! Steak fries are awesome!";
    }
}



class Curly extends Fries{


    public Curly() {
        super("Curly Fries", 2.05);
    }

    @Override
    public String sidesDescription() {
        return "Lightly seasoned to perfection! Curly fries rock!";
    }
}



class WaffleFries extends Fries{


    public WaffleFries() {
        super("Waffle Fries", 2.25);
    }

    @Override
    public String sidesDescription() {
        return "Thin, crispy and wonderful! Waffle fries are filling!";
    }
}
