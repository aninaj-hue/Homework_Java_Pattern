package homework;

public class TvObserver extends Observer {
    public TvObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println( "The Tv is on! " );
    }


}
