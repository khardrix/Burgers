package OOPTest;


abstract class Condiments extends Additions{


    public Condiments(String name, double price) {
        super(name, price);
    }
}



class Ketchup extends Condiments{


    public Ketchup() {
        super("Ketchup", 0.20);
    }

    @Override
    public String additionDescription(){
        return "Ketchup: Red and thick!";
    }
}



class Mustard extends Condiments{


    public Mustard() {
        super("Mustard", 0.30);
    }

    @Override
    public String additionDescription(){
        return "Mustard: Yellow and bitter!";
    }
}



class Mayonaisse extends Condiments{


    public Mayonaisse() {
        super("Mayonaisse", 0.90);
    }

    @Override
    public String additionDescription(){
        return "Mayonaisse: White, creamy and the best condiment for burgers!";
    }
}



class SpecialSauce extends Condiments{


    public SpecialSauce() {
        super("Special Sauce", 1.25);
    }

    @Override
    public String additionDescription(){
        return "Special Sauce: Our secret sauce is world famous!";
    }
}
