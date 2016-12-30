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
    }

    @Test public void should_return_I_can_swim_when_red_head_duck_swims() {
    }

    @Test public void should_return_green_head_duck_when_display_a_green_head_duck() {
    }

    @Test public void should_return_I_can_quack_when_green_head_duck_quacks() {
    }

    @Test public void should_return_I_can_swim_when_green_head_duck_swims() {
    }
}
