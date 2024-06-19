import org.junit.jupiter.api.Test;

public class StockInfoTest extends BaseTest{


    @Test
    public void orlaNorwayInfoTest(){

        //Use Case:
       // 1. Open Home page (make any check here if needed).
        //2. Click the “Trading” link located at the top menu (make any check here if needed).
        //3. Click on “Stock CFDs” (make any check here if needed).
        //4. Choose the "Norway" stock filter.
        //5. Get data from the table for the "Orkla ASA (ORK.OL)"  (make any check here if needed).
       // 6. Click on the "READ MORE" at this brand.
        //7. Compare the data from the previous table with data in "Trading Conditions".

        //Click on Accel all button pf popup
        mainPage.clickOnAcceptAllButton();
        //sleep(3000);

        ////Click the “Trading” link located at the top menu (make any check here if needed).
        mainPage.clickOnTradingLink();

        //sleep(5000);

       tradingPage.successTradingPage("TRADING");


       //sleep(5000);

        //3. Click on “Stock CFDs” (make any check here if needed).
       tradingPage.clickOnStocksLink();

       stocksPage.chooseFilterNorway();

       //Click on 2nd page in paging section - HomeWork
        //Sout (Spread as lo as(quote currency) for Orkla ASA (ORK.OL))


        //stocksPage.followSecondPage();

        //5. Get data from the table for the "Orkla ASA (ORK.OL)"  (make any check here if needed).
        stocksPage.enterFilter("ORK.OL");
        stocksPage.orklaMinSpread("1.115");





    }
}
