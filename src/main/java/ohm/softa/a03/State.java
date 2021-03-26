package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    static final Logger logger = LogManager.getLogger();
    private int t;
    private final int duration;

    public int getTime(){
        return t;
    }

    public int getDuration() {
        return duration;
    }

    public State(int duration_, int time){
        duration = duration_;
        t=time;
    }

     final State tick(Cat cat){

        logger.info("tick()");
        logger.info(this.toString());
        t++;
        //cat.tick();
        if(getTime()<getDuration()){
            return this;
        }else{
            return successor(cat);
        }
    }

    abstract State successor(Cat cat);
}
