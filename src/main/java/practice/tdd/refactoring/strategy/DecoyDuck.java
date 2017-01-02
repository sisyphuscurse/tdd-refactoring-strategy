package practice.tdd.refactoring.strategy;

/**
 * Created by zhongdj on 30/12/2016.
 */
public class DecoyDuck extends AbsDuck {

    public String display() {
        return "decoy duck";
    }

    @Override public String quack() {
        return "I cannot quack";
    }

    @Override public String swim() {
        return "I cannot swim";
    }

    @Override public String fly() {
        return "I cannot fly";
    }
}
