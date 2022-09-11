package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
        page.cerezKabulEtButonu.click();

    }

    @Then("kullanici giyim aksesuar bolumune tiklar")
    public void kullanici_giyim_aksesuar_bolumune_tiklar() {
        page.giyimAksesuarBolumu.click();
    }

    @Then("kullanici kadin ic giyim bolumune tiklar")
    public void kullanici_kadin_ic_giyim_bolumune_tiklar() {
        page.kadınIcGiyimSecenegi.click();
    }

    @Then("kullanici Dizalti corap bolumune tiklar")
    public void kullaniciDizaltiCorapBolumuneTiklar() {
        page.dizAltiCorapBolumu.click();
    }

    @Then("kullanici acilan ilk urunun siyah oldugunu dogrular")
    public void kullanici_acilan_ilk_urunun_siyah_oldugunu_dogrular() {
        page.siyahCorapSec.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Siyah";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("kullanici sepete ekle butonuna tiklar")
    public void kullanici_sepete_ekle_butonuna_tiklar() {
        page.sepeteEkleButonu.click();
    }

    @Then("kullanici sepeti goruntule butonuna tiklar")
    public void kullanici_sepeti_goruntule_butonuna_tiklar() {
        page.sepetiGoruntuleSecenegi.click();
    }

    @Then("kullanici sepeti onayla butonuna tiklar")
    public void kullanici_sepeti_onayla_butonuna_tiklar() {
        page.sepetiOnaylaButonu.click();
    }

    @Then("kullanici uye olmadan devam et butonuna tiklar")
    public void kullanici_uye_olmadan_devam_et_butonuna_tiklar() {
        page.uyeOlmadanDevamEtButonu.click();
    }

    @Then("kullanici mail kutusuna mail girer")
    public void kullanici_mail_kutusuna_mail_girer() {
        page.mailKutusu.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
    }

    @Then("kullanici yeni adres olustur butonuna tiklar")
    public void kullanici_yeni_adres_olustur_butonuna_tiklar() {
        page.yeniAdresOlustursecenegi.click();

    }

    @Then("kullanici adres bilgilerini basariyla girer")
    public void kullanici_adres_bilgilerini_basariyla_girer() {
        page.adresBasligiKutusu.sendKeys(ConfigReader.getProperty("sehir"));
        page.adKutusu.sendKeys(faker.name().firstName());
        page.soyadKutusu.sendKeys(faker.name().lastName());
        page.cepTelefonuKutusu.sendKeys(ConfigReader.getProperty("telNo"));
        Select select = new Select(page.ilDropDown);
        select.selectByVisibleText("ESKİŞEHİR");
        Select select2 = new Select(page.ilceDropDown);
        select2.selectByVisibleText("ODUNPAZARI");
        Driver.wait(2);
        Select select3 = new Select(page.mahalleDropDown);
        select3.selectByVisibleText("71 EVLER MAH");


        page.adresKutusu.sendKeys(ConfigReader.getProperty("adres"));
        page.postaKoduKutusu.sendKeys(ConfigReader.getProperty("postaKodu"));
        page.adresKaydetButonu.click();


    }

    @Then("kullanici kargo secer ve kaydet ve devam et butonuna tiklar")
    public void kullanici_kargo_secer_ve_kaydet_ve_devam_et_butonuna_tiklar() {
        Driver.wait(2);
        page.kaydetVeDevamEtButonu.click();
    }

    @Then("kullanici odeme ekranina ulastigini kontrol eder")
    public void kullanici_odeme_ekranina_ulastigini_kontrol_eder() {
        Driver.wait(3);
        String actualTitle = Driver.getDriver().getCurrentUrl();
        String expectedTitle = "orders/checkout";
        Assert.assertTrue(actualTitle.contains(expectedTitle));


        Driver.ekranGoruntusu();


    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
