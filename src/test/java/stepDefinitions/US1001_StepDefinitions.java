package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US1001_StepDefinitions {
    A101Page page = new A101Page();
    Faker faker = new Faker();

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
        //   Driver.getDriver().switchTo().frame(page.iframe);
        page.mailKutusu.sendKeys("neval70@hotmail.com" + Keys.ENTER);
    }

    @Then("kullanici yeni adres olustur butonuna tiklar")
    public void kullanici_yeni_adres_olustur_butonuna_tiklar() {

    }

    @Then("kullanici adres bilgilerini basariyla girer")
    public void kullanici_adres_bilgilerini_basariyla_girer() {

    }

    @Then("kullanici kargo secer ve kaydet ve devam et butonuna tiklar")
    public void kullanici_kargo_secer_ve_kaydet_ve_devam_et_butonuna_tiklar() {

    }

    @Then("kullanici odeme ekranina ulastigini kontrol eder")
    public void kullanici_odeme_ekranina_ulastigini_kontrol_eder() {

    }


}
