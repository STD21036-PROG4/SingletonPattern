package singletonClass;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ClassSingletonTest {
    @Test
    public void testAString(){
        ClassSingleton singleton = ClassSingleton.getTestOne();
        String expected = "test";
        String actual = singleton.getDescription();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testModifyString(){
        ClassSingleton singleton0 = ClassSingleton.getTestOne();
        ClassSingleton singleton1 = ClassSingleton.getTestOne();
        ClassSingleton singleton2 = ClassSingleton.getTestOne();
        ClassSingleton singleton3 = ClassSingleton.getTestOne();

        singleton0.setDescription("test0");
        Assert.assertEquals("test0",ClassSingleton.getTestOne().getDescription());

        singleton1.setDescription("test1");
        Assert.assertEquals("test1",ClassSingleton.getTestOne().getDescription());

        singleton2.setDescription("test2");
        Assert.assertEquals("test2",ClassSingleton.getTestOne().getDescription());

        singleton3.setDescription("test3");
        Assert.assertEquals("test3",ClassSingleton.getTestOne().getDescription());
    }
}
