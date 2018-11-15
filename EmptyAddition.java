package OOPTest;


public class EmptyAddition extends Additions{


    public EmptyAddition() {
        super("N/A", 0.00);
    }

    @Override
    public String additionDescription(){
        return "No Addition!";
    }
}
