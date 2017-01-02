package practice.tdd.refactoring.strategy;

/**
 * Created by zhongdj on 30/12/2016.
 */
public class DecoyDuck extends AbsDuck {

    public String display() {
        return "decoy duck";
    }

    @Override public String quack() {
        return super.quack();
    }

    @Override public String swim() {
        return super.swim();
    }

    @Override public String fly() {
        return super.fly();
    }
}
