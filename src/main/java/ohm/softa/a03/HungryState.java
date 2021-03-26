package ohm.softa.a03;

public class HungryState extends State{
    public HungryState(int duration_, int time) {
        super(duration_,time);
    }

    @Override
    State successor(Cat cat) {
        logger.info("I've starved for a too long time...good bye...");
        return new DeathState(-1,getTime());
    }
    State feed(Cat cat){
        logger.info("You feed the cat...");
        return new DigestingState(getTime()+cat.getDigest(),getTime());
    }

    @Override
    public String toString(){
        return "Hungry";
    }
}
