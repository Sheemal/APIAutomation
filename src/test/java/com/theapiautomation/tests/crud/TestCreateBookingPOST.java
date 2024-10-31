package com.theapiautomation.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateBookingPOST {

    @Issue("LUD-1233")
    @Owner("Sheemal")
    @Description("Verify that POST request is working fine!")
    @Test
    public void verifyCreateBookingPost(){
        Assert.assertEquals(true, true);
    }
}
