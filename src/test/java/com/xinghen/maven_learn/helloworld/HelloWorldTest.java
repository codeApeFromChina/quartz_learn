package com.xinghen.maven_learn.helloworld;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by xinghen on 2017/3/17.
 */
public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();

        Assert.assertEquals("hello world!!", result);
    }
}
