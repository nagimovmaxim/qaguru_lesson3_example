package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase{

    @Test
    void successfulFillFormTest(){
        open("/text-box");
        $("[id=userName]").setValue("NameLastname");
        $("[id=userEmail]").setValue("mail@email.com");
        $("[id=currentAddress]").setValue("First address");
        $("[id=permanentAddress]").setValue("Second address");
        $("[id=submit]").click();

        $("[id=output] [id=name]").shouldHave(text("NameLastname"));
        $("[id=output] [id=email]").shouldHave(text("mail@email.com"));
        $("[id=output] [id=currentAddress]").shouldHave(text("First address"));
        $("[id=output] [id=permanentAddress]").shouldHave(text("Second address"));
    }
}
