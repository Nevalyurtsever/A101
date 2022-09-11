package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {
    public A101Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezKabulEtButonu;
    @FindBy(xpath = "//a[normalize-space()='Giyim & aksesuar']")
    public WebElement giyimAksesuarBolumu;


    @FindBy(xpath = "//a[@class='js-filter-link '][contains(text(),'Kadın İç Giyim')]")
    public WebElement kadınIcGiyimSecenegi;
    @FindBy(xpath = "//a[@class='js-filter-link '][contains(text(),'Dizaltı Çorap')]")
    public WebElement dizAltiCorapBolumu;
    @FindBy(xpath = "//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    public WebElement siyahCorapSec;
    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkleButonu;
    @FindBy(xpath = "(//*[text()='Sepeti Görüntüle'])[2]")
    public WebElement sepetiGoruntuleSecenegi;
    @FindBy(xpath = "//*[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnaylaButonu;
    @FindBy(xpath = "//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamEtButonu;
    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement mailKutusu;
    @FindBy(xpath = "//*[@title='Yeni adres oluştur']")
    public WebElement yeniAdresOlustursecenegi;
    //Adres Bilgileri Locateleri
    @FindBy(xpath = "//*[@placeholder='Ev adresim, iş adresim vb.']")
    public WebElement adresBasligiKutusu;
    @FindBy(xpath = "//*[@name='first_name']")
    public WebElement adKutusu;
    @FindBy(xpath = "//*[@name='last_name']")
    public WebElement soyadKutusu;
    @FindBy(xpath = "//*[@name='phone_number']")
    public WebElement cepTelefonuKutusu;
    @FindBy(xpath = "//select[@name='city']")
    public WebElement ilDropDown;
    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilceDropDown;
    @FindBy(xpath = "//*[@name='district']")
    public WebElement mahalleDropDown;
    @FindBy(xpath = "//*[@name='line']")
    public WebElement adresKutusu;
    @FindBy(xpath = "//*[@name='postcode']")
    public WebElement postaKoduKutusu;
    @FindBy(xpath = "//button[normalize-space()='KAYDET']")
    public WebElement adresKaydetButonu;
    @FindBy(xpath = "//*[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamEtButonu;


}
