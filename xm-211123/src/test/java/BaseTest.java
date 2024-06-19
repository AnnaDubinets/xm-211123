import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {


    @BeforeEach
    public void setUp(){

        open("https://www.xm.com/");
    }

    MainPage mainPage = new MainPage();

    TradingPage tradingPage = new TradingPage();

    StocksPage stocksPage = new StocksPage();
}
