package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

@Test
public void testGetLastLog(){
    //given
    //when
    Logger.getInstance().log("Login1");
    String result = Logger.getInstance().getLastLog();
    //then
    Assert.assertEquals("Login1",result);
}
}
