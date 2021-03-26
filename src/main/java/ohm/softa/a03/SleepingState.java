package ohm.softa.a03;

public class SleepingState extends State {
    public SleepingState(int duration_, int time) {
        super(duration_,time);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Yoan... getting hungry!");
        return new HungryState(cat.getAwake()+getTime(),getTime());
    }

    @Override
    public String toString(){
        return "Sleeping";
    }

}
