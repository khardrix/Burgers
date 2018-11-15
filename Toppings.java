package OOPTest;


abstract class Toppings extends Additions{


    public Toppings(String name, double price) {
        super(name, price);
    }


    public String additionDescription() {
        return "We have the best toppings!";
    }
}



class Lettuce extends Toppings{


    public Lettuce() {
        super("Lettuce", 0.25);
    }

    @Override
    public String additionDescription() {
        return "Lettuce: Crispy and green!";
    }
}



class Tomato extends Toppings{


    public Tomato() {
        super("Tomato", 0.20);
    }

    @Override
    public String additionDescription() {
        return "Tomato: Juicy and ripe red!";
    }
}



class Carrot extends Toppings{


    public Carrot() {
        super("Carrot", 0.15);
    }

    @Override
    public String additionDescription() {
        return "Carrot: Crispy and orange!";
    }
}



class Pickle extends Toppings{


    public Pickle() {
        super("Pickle", 0.40);
    }

    @Override
    public String additionDescription() {
        return "Pickle: Juicy, crispy, green, sweet and bitter all at the same time!";
    }
}



class Bacon extends Toppings{


    public Bacon() {
        super("Bacon", 0.85);
    }

    @Override
    public String additionDescription() {
        return "Bacon: Crisp, juicy and golden brown!";
    }
}



class Onion extends Toppings{


    public Onion() {
        super("Onion", 0.50);
    }

    @Override
    public String additionDescription() {
        return "Onion: Crispy, yellow, sweet and spicy at the same time!";
    }
}



class Mushroom extends Toppings{


    public Mushroom() {
        super("Mushroom", 1.10);
    }

    @Override
    public String additionDescription(){
        return "Mushroom: Juicy, golden brown and delicious!";
    }
}



