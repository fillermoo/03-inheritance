package ohm.softa.a03;

public class DeathState extends State{
    public DeathState( int duration_, int time) {
        super(duration_,time);
    }

    @Override
    public State successor(Cat cat) {
        return this;
    }

    @Override
    public String toString(){
        return "Playful";
    }
}
