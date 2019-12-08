package com.itea.homeworks.task6;

import com.itea.homeworks.task5.singleton.Singleton;
import com.itea.homeworks.task6.breaksingle.SingleBreaking;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertTrue;

public class SingletonBreakingServiceXmlTest {

    @Test
    public void ShouldBeDifferentHashCode() throws Exception {
        Singleton instance1 = Singleton.instance.getInstance();
        SingleBreaking breaking = new SingleBreaking();

        Singleton instance2 = breaking.breakSingle(instance1);

        assertTrue(instance1.hashCode() != instance2.hashCode());
    }

}
