import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement acceptAllButtonPopup = $(byCssSelector("[class=\"btn btn-block btn-red btn-solid js-acceptDefaultCookie gtm-acceptDefaultCookieFirstVisit\"]"));

    private SelenideElement tradingLink = $(byCssSelector("#main-nav > li.main_nav_trading > a"));


    public void clickOnAcceptAllButton(){

        acceptAllButtonPopup.click();
    }

    public void clickOnTradingLink(){
        tradingLink.click();
    }



}
