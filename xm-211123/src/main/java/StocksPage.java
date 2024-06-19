import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class StocksPage {

    private SelenideElement successStocksPage = $("[class=\"ltr text-left\"]");

    private SelenideElement norwayFilter = $("[data-value=\"Norway\"]");

    private SelenideElement closeStickyMenu = $("[class=\\\"fa fa-times\\\"]");

    private SelenideElement secondPage = $("#DataTables_Table_0_paginate [data-dt-idx=\"2\"]");

    private SelenideElement searchInput = $("[type=\"search\"]");

    private SelenideElement orlaFilter = $("[data-xm-qa-name=\"minSpread\"]");




    public void successTradingPage(String expectedText){
        successStocksPage.shouldHave(text(expectedText));
    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void chooseFilterNorway(){
        scrollToElement(norwayFilter);
        norwayFilter.shouldBe(visible);
        norwayFilter.scrollIntoView(true);
        try {
            norwayFilter.shouldBe(Condition.interactable, Duration.ofMillis(200));

        }catch (ElementClickInterceptedException e) {
            closeStickyMenu.click();
            sleep(2000);
            norwayFilter.click();
        }
    }

    public void followSecondPage(){
        secondPage.click();
    }

    public void enterFilter(String filterValue){
        searchInput.sendKeys(filterValue);
    }

    public void orklaMinSpread(String expectedValue){
        scrollToElement(orlaFilter);
        orlaFilter.shouldHave(Condition.text(expectedValue));
        //System.out.println(orlaFilter.getText());
    }

}



