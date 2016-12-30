package practice.tdd.refactoring.strategy;

/**
 * Created by zhongdj on 30/12/2016.
 */
public abstract class AbsDuck {

    public abstract String display();

    public String quack() {
        return "I can quack";
    }

    public String swim() {
        return "I can swim";
    }

    public String fly() {
        return "I can fly";
    }
}
