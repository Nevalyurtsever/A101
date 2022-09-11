@a101feature
Feature: US1001 istenen gorevleri yapabilmelidir


  Background:Kullanici siteye giris yapar
    Given kullanici A101 anasayfasinda

  @a101scenario
  Scenario:TC01 Kullanici acilan ürünün siyah oldugunu dogrular ve odeme ekranına ulastigini dogrular
    Then  kullanici giyim aksesuar bolumune tiklar
    Then kullanici kadin ic giyim bolumune tiklar
    Then kullanici Dizalti corap bolumune tiklar
    And kullanici acilan ilk urunun siyah oldugunu dogrular
    And kullanici sepete ekle butonuna tiklar
    And kullanici sepeti goruntule butonuna tiklar
    And kullanici sepeti onayla butonuna tiklar
    And kullanici uye olmadan devam et butonuna tiklar
    And kullanici mail kutusuna mail girer
    And kullanici yeni adres olustur butonuna tiklar
    And kullanici adres bilgilerini basariyla girer
    And kullanici kargo secer ve kaydet ve devam et butonuna tiklar
    And kullanici odeme ekranina ulastigini kontrol eder
    And kullanici sayfayi kapatir






