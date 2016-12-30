package practice.tdd.refactoring.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhongdj on 30/12/2016.
 */
public class DucksTest {

    @Test public void should_return_red_head_duck_when_display_a_red_head_duck() {
        //given
        final RedHeadDuck theDuck = new RedHeadDuck();
        //when
        final String displayed = theDuck.display();
        //then
        Assert.assertEquals("red head duck", displayed.toLowerCase());
    }

    @Test public void should_return_I_can_quack_when_red_head_duck_quacks() {
        //given
        final RedHeadDuck theDuck = new RedHeadDuck();
        //when
        final String quacked = theDuck.quack();
        //then
        Assert.assertEquals("i can quack", quacked.toLowerCase());
    }

    @Test public void should_return_I_can_swim_when_red_head_duck_swims() {
        //given
        final RedHeadDuck theDuck = new RedHeadDuck();
        //when
        final String swimmed = theDuck.swim();
        //then
        Assert.assertEquals("i can swim", swimmed.toLowerCase());
    }

    @Test public void should_return_green_head_duck_when_display_a_green_head_duck() {
        //given
        final GreenHeadDuck theDuck = new GreenHeadDuck();
        //when
        final String displayed = theDuck.display();
        //then
        Assert.assertEquals("green head duck", displayed.toLowerCase());
    }

    @Test public void should_return_I_can_quack_when_green_head_duck_quacks() {
        //given
        final GreenHeadDuck theDuck = new GreenHeadDuck();
        //when
        final String quacked = theDuck.quack();
        //then
        Assert.assertEquals("i can quack", quacked.toLowerCase());
    }

    @Test public void should_return_I_can_swim_when_green_head_duck_swims() {
        //given
        final GreenHeadDuck theDuck = new GreenHeadDuck();
        //when
        final String swimmed = theDuck.swim();
        //then
        Assert.assertEquals("i can swim", swimmed.toLowerCase());
    }

    @Test public void should_return_rubber_duck_when_display_a_rubber_duck() {
        //given
        final RubberDuck theDuck = new RubberDuck();
        //when
        final String displayed = theDuck.display();
        //then
        Assert.assertEquals("rubber duck", displayed.toLowerCase());
    }

    @Test public void should_return_I_can_quack_when_a_rubber_quacks() {
        //given
        final RubberDuck theDuck = new RubberDuck();
        //when
        final String quacked = theDuck.quack();
        //then
        Assert.assertEquals("i can quack", quacked.toLowerCase());
    }

    @Test public void should_return_I_can_swim_when_rubber_duck_swims() {
        //given
        final RubberDuck theDuck = new RubberDuck();
        //when
        final String swimmed = theDuck.swim();
        //then
        Assert.assertEquals("i can swim", swimmed.toLowerCase());
    }

    @Test public void should_return_I_can_fly_when_red_head_duck_fly() {
        //given
        final RedHeadDuck theDuck = new RedHeadDuck();
        //when
        final String flied = theDuck.fly();
        //then
        Assert.assertEquals("i can fly", flied.toLowerCase());
    }

    @Test public void should_return_I_can_fly_when_green_head_duck_fly() {
        //given
        final GreenHeadDuck theDuck = new GreenHeadDuck();
        //when
        final String flied = theDuck.fly();
        //then
        Assert.assertEquals("i can fly", flied.toLowerCase());
    }

    @Test public void should_return_I_cannot_fly_when_rubber_duck_fly() {
        //given
        final RubberDuck theDuck = new RubberDuck();
        //when
        final String flied = theDuck.fly();
        //then
        Assert.assertEquals("i cannot fly", flied.toLowerCase());
    }
}
