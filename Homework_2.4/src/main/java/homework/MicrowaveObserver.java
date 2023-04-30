package homework;

public class MicrowaveObserver extends Observer{
    public MicrowaveObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println( "The microwave is on! " );
    }
}
