package OOPTest;


public class EmptySides extends Sides{


    public EmptySides() {
        super("N/A", 0.00);
    }

    @Override
    public String sidesDescription(){
        return "Try a combo meal next time!";
    }
}
