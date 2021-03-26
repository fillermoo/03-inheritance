package ohm.softa.a03;

public class DigestingState extends State{
    public DigestingState(int duration_, int time){
        super(duration_,time);
    }
    @Override
    public State successor(Cat cat) {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(getTime()+cat.getAwake()-getDuration(),getTime());
    }

    @Override
    public String toString(){
        return "Digest";
    }
}
