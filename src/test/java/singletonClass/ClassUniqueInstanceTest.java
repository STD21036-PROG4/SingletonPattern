package singletonClass;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ClassUniqueInstanceTest {
    @Test
    public void testA(){
        ClassUniqueInstance singleton = ClassUniqueInstance.INSTANCE.getInstance();
        Integer expected = 1;
        Integer actual = singleton.getClick();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testModifyNumber(){
        ClassUniqueInstance singleton0 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance singleton1 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance singleton2 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance singleton3 = ClassUniqueInstance.INSTANCE.getInstance();

        singleton0.setClick(0);
        Assert.assertEquals(singleton0.getClick(), ClassUniqueInstance.INSTANCE.getInstance().getClick());

        singleton1.setClick(1);
        Assert.assertEquals(singleton0.getClick(), ClassUniqueInstance.INSTANCE.getInstance().getClick());

        singleton2.setClick(2);
        Assert.assertEquals(singleton0.getClick(), ClassUniqueInstance.INSTANCE.getInstance().getClick());

        singleton3.setClick(3);
        Assert.assertEquals(singleton0.getClick(), ClassUniqueInstance.INSTANCE.getInstance().getClick());

    }
}
