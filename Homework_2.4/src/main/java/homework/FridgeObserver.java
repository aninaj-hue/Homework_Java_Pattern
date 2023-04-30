package homework;

public class FridgeObserver extends Observer {
    public FridgeObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println( "The fridge is on! " );
    }
}
