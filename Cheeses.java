package OOPTest;


abstract class Cheeses extends Additions{


    public Cheeses(String name, double price) {
        super(name, price);
    }
}



class American extends Cheeses{


    public American() {
        super("American cheese", 1.50);
    }

    @Override
    public String additionDescription(){
        return "American: The traditional cheese for burgers!";
    }
}



class Swiss extends Cheeses{


    public Swiss() {
        super("Swiss cheese", 1.80);
    }

    @Override
    public String additionDescription(){
        return "Swiss: The very best burger cheese!";
    }
}



class Bleu extends Cheeses{


    public Bleu() {
        super("Bleu cheese", 1.75);
    }

    @Override
    public String additionDescription(){
        return "Bleu cheese: Something different and amazing!";
    }
}



class Cheddar extends Cheeses{


    public Cheddar() {
        super("Cheddar cheese", 1.10);
    }

    @Override
    public String additionDescription(){
        return "Cheddar cheese: Usually for tacos, but amazing on burgers!";
    }
}



