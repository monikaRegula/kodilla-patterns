package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Set;

public class SettingsFileEngineTestSuite {
    @BeforeClass
    public static void openSettingsFile(){
        SettingsFIleEngine.getInstance().open("myApp");
    }
    @AfterClass
    public static void closeSettingsFile(){
        SettingsFIleEngine.getInstance().close();
    }

    @Test
    public void testGetFIleName(){
        //given
        //when
        String fileName = SettingsFIleEngine.getInstance().getFileName();
        System.out.println("Opened: "+fileName);
        //then
        Assert.assertEquals("myApp",fileName);
    }

    @Test
    public void testLoadSettings(){
        //given
        //when
        boolean result = SettingsFIleEngine.getInstance().loadSettings();
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings(){
        //given
        //when
        boolean result = SettingsFIleEngine.getInstance().saveSettings();
        //then
        Assert.assertTrue(result);
    }
}
