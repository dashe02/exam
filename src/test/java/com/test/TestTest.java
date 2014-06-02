package com.test;

import org.junit.*;
import static org.junit.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 下午10:33
 * To change this template use File | Settings | File Templates.
 */
public class TestTest {
    private static Test test=new Test();
    @Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void testGetString() throws Exception {
        String str="abcde";
        int minLength=7;
        char padChar='x';
        assertEquals("xxabcde",test.getString(str,minLength,padChar));
    }
}
