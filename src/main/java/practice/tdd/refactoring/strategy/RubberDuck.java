package practice.tdd.refactoring.strategy;

/**
 * Created by zhongdj on 30/12/2016.
 */
public class RubberDuck extends AbsDuck {

    public String display() {
        return "rubber duck";
    }

    @Override public String fly() {
        return "I cannot fly";
    }
}
