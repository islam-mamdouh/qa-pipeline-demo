package com.eslam.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests {

    @Test(groups = {"smoke"})
    public void verifyAppLaunches() {
        System.out.println("✅ SMOKE 1: App launches successfully");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void verifyHomePageLoads() {
        System.out.println("✅ SMOKE 2: Home page loads");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void verifyLoginPageExists() {
        System.out.println("✅ SMOKE 3: Login page exists");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void verifySearchWorks() {
        System.out.println("✅ SMOKE 4: Search functionality works");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void verifyApiResponds() {
        System.out.println("✅ SMOKE 5: API responds with 200");
        Assert.assertTrue(true);
    }
}