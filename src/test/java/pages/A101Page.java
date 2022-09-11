package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {
    public A101Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezKabulEt;
    @FindBy(xpath = "//a[normalize-space()='Giyim & aksesuar']")
    public WebElement giyimAksesuar;
    @FindBy(xpath = "//a[@class='js-filter-link '][contains(text(),'Kadın İç Giyim')]")
    public WebElement kadınIcGiyim;
    @FindBy(xpath = "//a[@class='js-filter-link '][contains(text(),'Dizaltı Çorap')]")
    public WebElement dizAltiCorap;
    @FindBy(xpath = "//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    public WebElement siyahCorap;
    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkle;
    @FindBy(xpath = "(//*[text()='Sepeti Görüntüle'])[2]")
    public WebElement sepetiGoruntule;
    @FindBy(xpath = "//*[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnayla;
    @FindBy(xpath = "//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamEt;
    @FindBy(xpath = "//iframe[@id='_hjRemoteVarsFrame']")
    public WebElement iframe;
    @FindBy(xpath = "//label[text()='E-mail']")
    public WebElement mailKutusu;


}
