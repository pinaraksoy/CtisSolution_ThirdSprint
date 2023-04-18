package com.ctisSolution.step_definitions;



import com.ctisSolution.pages.MessageAttachmentPage_Armel;
import com.ctisSolution.utilities.Driver;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class MessageAttachment_Armel {


    WebDriver driver;
    MessageAttachmentPage_Armel armelPage;

    @Before(value = "@wip", order = 2)
    public void setUp() {
        driver = Driver.getDriver();
        armelPage = new MessageAttachmentPage_Armel();


    }


}
