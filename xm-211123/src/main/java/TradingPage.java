import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class TradingPage {

    private SelenideElement tradingPage = $(byCssSelector("[class=\"main_nav_trading selected\"]"));

    private SelenideElement stocksLink = $(byCssSelector("[class=\"menu-stocks\"] [href=\"https://www.xm.com/stocks\"]"));

    public void successTradingPage(String expectedText){
        tradingPage.shouldHave(text(expectedText));
    }

    public void clickOnStocksLink(){
        stocksLink.shouldBe(Condition.visible).click();
    }
}
