package com.testinium.test;
import com.testinium.driver.Base_Test;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginTest extends Base_Test {
    @Test
    public void LoginTest(){
        Methods methods =new Methods();
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("/html/body/div[7]/button[1]"));
        methods.waitBySeconds(2);


        methods.sendKeys(By.id("login-email"),"hakki.kiyak71@gmail.com ");
        methods.waitBySeconds(1);

        methods.sendKeys(By.id("login-password"),"9512643Aa.");
        methods.waitBySeconds(1);

        methods.click(By.xpath("//i[@class='fa fa-eye-slash ky-show-password js-show-toggle-pw']"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//i[@class='fa ky-show-password js-show-toggle-pw fa-eye']"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//button[@class='ky-btn ky-btn-orange w-100 ky-login-btn']"));
        methods.waitBySeconds(1);

        WebElement result = methods.findElement(By.xpath("//h1[@class='section']"));
        assert result.getText().equals("Hesabım");


        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        //7. ürüne gidip 4 ürün favorilere ekleme

        //listelerime gidip favorilere gitme kıyaslama eksik
        String text1 = methods.getText(By.xpath("(//a[@title='Oyuncak Tamirhanesi'])[1]"));
        methods.waitBySeconds(1);
        String text2 = methods.getText(By.xpath("//a[@title='Emre ve Tahta Oyuncak']"));
        methods.waitBySeconds(1);
        String text3 = methods.getText(By.xpath("//a[@title='Candy Doktor Çantası (01923)']"));
        methods.waitBySeconds(1);
        String text4 = methods.getText(By.xpath("//a[@title='Oyuncak Ev - Duygularımı Fark Ediyorum']"));
        methods.waitBySeconds(1);

        methods.scrollWithAction(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[6]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[8]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[9]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));



        String expectedtext1 = methods.getText(By.xpath("//a[@title='Oyuncak Tamirhanesi']"));
        methods.waitBySeconds(1);
        String expectedtext2 = methods.getText(By.xpath("//a[@title='Emre ve Tahta Oyuncak']"));
        methods.waitBySeconds(1);
        String expectedtext3 = methods.getText(By.xpath("//a[@title='Candy Doktor Çantası (01923)']"));
        methods.waitBySeconds(1);
        String expectedtext4 = methods.getText(By.xpath("//a[@title='Oyuncak Ev - Duygularımı Fark Ediyorum']"));
        methods.waitBySeconds(1);
        //anasayfaya dönme
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[2]/a/img"));
        methods.waitBySeconds(3);
        //Puan katoloğuna gitme
        methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[2]/a"));
        methods.waitBySeconds(3);
        //türk klasiklerine gitme
        methods.click(By.xpath("/html/body/div[5]/div/div/div[2]/div/div[4]/a[2]/img"));
        methods.waitBySeconds(3);
        //yüksek oylama seçme
        methods.click(By.xpath("/html/body/div[5]/div/div[3]/div/div/div[1]/div/div[1]/select"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[5]/div/div[3]/div/div/div[1]/div/div[1]/select/option[10]"));
        methods.waitBySeconds(2);
        //tüm kitaplar-hobi gitme
        methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.waitBySeconds(2);
        //random
        methods.randomElement(By.xpath("/html/body/div[5]/div/div[3]/div/div[1]/div/div[2]/ul/li"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[5]/div/div/div[8]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[6]/a/span"));
        methods.waitBySeconds(2);

        //listelerim favorilerime gidlir
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);
        //3. ürün sil
        methods.scrollWithAction(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/div[4]/div[1]/div[2]/a/span"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[3]/a[3]/i"));
        methods.waitBySeconds(2);
        //sepete gidilir
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[1]/div[1]/span"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[2]/div[2]/div[2]/div/a"));
        methods.waitBySeconds(2);

        //artış
        WebElement input = methods.findElement(By.xpath("//input[@name='quantity']"));
        input.clear();
        input.sendKeys("2");



        //satın al
        methods.click(By.xpath("/html/body/div[5]/div/div/div[2]/div/div[1]/table/thead/tr/td[8]/a"));
        methods.waitBySeconds(2);
        //adres
        methods.click(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div/a[2]"));
        methods.waitBySeconds(2);

        methods.sendKeys(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/table/tbody/tr[1]/td[2]/input"),"hakki");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/table/tbody/tr[2]/td[2]/input"),"kiyak");
        methods.waitBySeconds(2);

        methods.selectByText(By.xpath("//select[@id='address-zone-id']"), "İstanbul");
        methods.waitBySeconds(1);
        methods.selectByText(By.xpath("//select[@id='address-county-id']"), "SANCAKTEPE");
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/table/tbody/tr[6]/td[2]/input"),"selami ali");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/table/tbody/tr[7]/td[2]/textarea"),"görümce sokak");
        methods.waitBySeconds(2);



        WebElement postakodu = methods.findElement(By.xpath("//input[@id='address-postcode']"));
        postakodu.sendKeys("00034");


        WebElement ceptel = methods.findElement(By.xpath("//input[@id='address-mobile-telephone']"));
        ceptel.sendKeys("5073369802");


        WebElement sabittel = methods.findElement(By.xpath("//input[@id='address-telephone']"));
        sabittel.sendKeys("2222111122");


        methods.click(By.xpath("//input[@value='2']"));
        methods.waitBySeconds(2);


        WebElement vno = methods.findElement(By.xpath("//input[@name='company_id']"));
        vno.sendKeys("Sancaktepe");


        WebElement tcno = methods.findElement(By.xpath("//input[@id='address-tax-id']"));
        tcno.sendKeys("6540395395");


        methods.click(By.xpath(" //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);


        methods.click(By.xpath(" //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);


        methods.waitBySeconds(2);


        WebElement kartsahibi = methods.findElement(By.xpath("//input[@id='credit-card-owner']"));
        kartsahibi.sendKeys("Hakkı Kıyak");
        methods.waitBySeconds(2);


        WebElement bosluk1 = methods.findElement(By.xpath("//table[@class='form']//tr[5]//input[1]"));
        bosluk1.sendKeys("1223");
        methods.waitBySeconds(2);


        WebElement bosluk2 = methods.findElement(By.xpath("//input[2]"));
        bosluk2.sendKeys("3344");
        methods.waitBySeconds(2);


        WebElement bosluk3 = methods.findElement(By.xpath("//input[3]"));
        bosluk3.sendKeys("1123");
        methods.waitBySeconds(2);


        WebElement bosluk4 = methods.findElement(By.xpath("//input[4]"));
        bosluk4.sendKeys("8675");
        methods.waitBySeconds(2);


        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-month']"), "11");
        methods.waitBySeconds(2);


        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-year']"), "2024");
        methods.waitBySeconds(2);

//Güvenlik kodu girişi
        WebElement cvvkod = methods.findElement(By.xpath("//input[@id='credit-card-security-code']"));
        cvvkod.sendKeys("220");

//Devam butonu tıklama
        methods.click(By.xpath(" //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);

        //Kart numara geçersiz kontrolü
        WebElement gecersiz = methods.findElement(By.xpath(" //span[@class='error']"));
        assert gecersiz.getText().equals("Kart numarası geçersiz. Kontrol ediniz!");

        //Anasayfa açılış
        methods.click(By.xpath("//img[@alt='kitapyurdu.com']"));
        methods.waitBySeconds(2);

//Çıkış yap butonu tıklama
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).build().perform();
        methods.waitBySeconds(2);

        WebElement option = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        option.click();
        methods.waitBySeconds(2);























    }

}