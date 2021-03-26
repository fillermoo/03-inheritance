package ohm.softa.a03;

public class PlayfulState extends State{
    public PlayfulState(int duration_, int time) {
        super(duration_,time);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Yoan... getting tired!");
        return new SleepingState(getTime()+cat.getSleep(),getTime());
    }
    @Override
    public String toString(){
        return "Playful";
    }
}
