package com.applaudo.homework0601.pages;

import com.applaudo.homework0601.BaseTest;
import com.applaudo.homework0601.listeners.DigitalCollectionsPageListener;
import com.google.common.base.Verify;
import org.testng.IInvokedMethod;
import org.testng.ITestResult;
import org.testng.annotations.*;

@Listeners(DigitalCollectionsPageListener.class)
public class DigitalCollectionsPageTest extends BaseTest {

    private DigitalCollectionsPage digitalCollectionsPage;

    @BeforeClass(alwaysRun = true)
    public void setupPages(){
        this.digitalCollectionsPage = new DigitalCollectionsPage(driver);
    }

    @Test(priority = 3,groups = "digitalCollectionsGroup")
    public void verifyWordIsPresent() throws InterruptedException {
        System.out.println("Executing Test 6 of DigitalCollectionsPage\n");
        digitalCollectionsPage.testSixDigitalCollectionsPage();
        waitTime();
        System.out.println("Finishing Test 6 of DigitalCollectionsPage\n");
    }

    @Test(priority = 4,groups = "digitalCollectionsGroup",dataProvider = "performSearchData")
    public void performSearch(String search) throws InterruptedException {
        System.out.println("Executing Test 7 of DigitalCollectionsPage\n");
        digitalCollectionsPage.testSevenDigitalCollectionsPage(search);
        waitTime();
        System.out.println("Finishing Test 7 of DigitalCollectionsPage\n");
    }

    @DataProvider
    public Object[][] performSearchData(){
        return new Object[][]{
                {"Abraham Lincoln"},
                {"Benjamin Franklin Papers"},
                {"Earth Day"},
        };

    }
}
