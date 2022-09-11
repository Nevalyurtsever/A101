package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class US1001_StepDefinitions {
    A101Page page = new A101Page();
    Faker faker = new Faker();
    Actions actions;

    @Given("kullanici A101 anasayfasinda")
    public void kullanici_a101_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
        page.cerezKabulEt.click();

    }

    @Then("kullanici giyim aksesuar bolumune tiklar")
    public void kullanici_giyim_aksesuar_bolumune_tiklar() {
        page.giyimAksesuar.click();
    }

    @Then("kullanici kadin ic giyim bolumune tiklar")
    public void kullanici_kadin_ic_giyim_bolumune_tiklar() {
        page.kadınIcGiyim.click();
    }

    @Then("kullanici Dizalti corap bolumune tiklar")
    public void kullaniciDizaltiCorapBolumuneTiklar() {
        page.dizAltiCorap.click();
    }

    @Then("kullanici acilan ilk urunun siyah oldugunu dogrular")
    public void kullanici_acilan_ilk_urunun_siyah_oldugunu_dogrular() {
        page.siyahCorap.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Siyah";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("kullanici sepete ekle butonuna tiklar")
    public void kullanici_sepete_ekle_butonuna_tiklar() {
        page.sepeteEkle.click();
    }

    @Then("kullanici sepeti goruntule butonuna tiklar")
    public void kullanici_sepeti_goruntule_butonuna_tiklar() {
        page.sepetiGoruntule.click();
    }

    @Then("kullanici sepeti onayla butonuna tiklar")
    public void kullanici_sepeti_onayla_butonuna_tiklar() {
        page.sepetiOnayla.click();
    }

    @Then("kullanici uye olmadan devam et butonuna tiklar")
    public void kullanici_uye_olmadan_devam_et_butonuna_tiklar() {
        page.uyeOlmadanDevamEt.click();
    }

    @Then("kullanici mail kutusuna mail girer")
    public void kullanici_mail_kutusuna_mail_girer() {
        page.mailKutusu.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
    }

    @Then("kullanici yeni adres olustur butonuna tiklar")
    public void kullanici_yeni_adres_olustur_butonuna_tiklar() {
        page.yeniAdresOlustur.click();

    }

    @Then("kullanici adres bilgilerini basariyla girer")
    public void kullanici_adres_bilgilerini_basariyla_girer() {
        page.adresBasligi.sendKeys("Eskisehir");
        actions = new Actions(Driver.getDriver());
        actions.
                sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.number().digits(10)).
                sendKeys(Keys.TAB).
                sendKeys("ESKİŞEHİR").
                sendKeys(Keys.TAB).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys("ODUNPAZARI").
                sendKeys(Keys.TAB).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys("71 EVLER MAH").
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("adres")).
                sendKeys(Keys.TAB).
                sendKeys("16090").
                perform();
        page.adresKaydet.click();
    }

    @Then("kullanici kargo secer ve kaydet ve devam et butonuna tiklar")
    public void kullanici_kargo_secer_ve_kaydet_ve_devam_et_butonuna_tiklar() {
        page.kaydetVeDevamEt.click();
    }

    @Then("kullanici odeme ekranina ulastigini kontrol eder")
    public void kullanici_odeme_ekranina_ulastigini_kontrol_eder() {
        String actualTitle = Driver.getDriver().getCurrentUrl();
        String expectedTitle="orders/checkout";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarih = date.format(dtf);

        File tumSayfaResim= new File("target/ekranGoruntuleri/tumSayfa"+tarih+".jpeg");
        File geciciDosya= ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaResim);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) throws InterruptedException {
        Thread.sleep(saniye * 1000);
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
