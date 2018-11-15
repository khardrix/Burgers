package OOPTest;


public class Drinks extends Sides{


    public Drinks(String name, double price) {
        super(name, price);
    }

    @Override
    public String sidesDescription(){
        return "Choose one of our cold drinks!";
    }
}


class Coke extends Drinks{


    public Coke() {
        super("Coke", 0.80);
    }

    @Override
    public String sidesDescription(){
        return "Coke: American classic!";
    }
}



class MountainDew extends Drinks{


    public MountainDew() {
        super("Mountain Dew", 1.00);
    }

    @Override
    public String sidesDescription(){
        return "Mountain Dew: It's great and green!";
    }
}



class Sprite extends Drinks{


    public Sprite() {
        super("Sprite", 0.75);
    }

    @Override
    public String sidesDescription(){
        return "Sprite: Clear and tropical!";
    }
}



class SweetTea extends Drinks{


    public SweetTea() {
        super("Sweet Tea", 0.70);
    }

    @Override
    public String sidesDescription(){
        return "Sweet Tea: A southern staple!";
    }
}



class Coffee extends Drinks{


    public Coffee() {
        super("Coffee", 0.50);
    }

    @Override
    public String sidesDescription(){
        return "Coffee: Tasty and will wake you up!";
    }
}
