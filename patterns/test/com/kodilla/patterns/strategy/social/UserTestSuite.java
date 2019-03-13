package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStartegies(){
        //given
        User kate = new Millenials("KATE");
        User john = new YGeneration("JOHN");
        User admin = new ZGeneration("ADMIN");

        //when
        String katePosted = kate.sharePost();
        System.out.println("Kate posted: "+katePosted);
        String johnPosted = john.sharePost();
        System.out.println("john posted : "+ johnPosted);
        String adminPosted = admin.sharePost();
        System.out.println("Admin posted : "+adminPosted);

        //then
        Assert.assertEquals("SNAPCHAT",katePosted);
        Assert.assertEquals("FACEBOOK",johnPosted);
        Assert.assertEquals("TWITTER",adminPosted);
    }

    @Test
    public void testIndividualSharingStartegy(){
        //given
        User admin = new ZGeneration("ADMIN");

        //when
        String adminPosted = admin.sharePost();
        System.out.println("Admin posted: "+adminPosted);
        admin.setSocialPublisher(new FacebookPublisher());
        adminPosted = admin.sharePost();
        System.out.println("Now admin posted: "+adminPosted);

        //then
        Assert.assertEquals("FACEBOOK",adminPosted);
    }
}
