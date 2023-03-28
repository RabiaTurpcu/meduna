Feature: US001

  Scenario: test01

  Given medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Register butonuna tiklar
    And SNN kutusuna uygun ssn girer
    Then hata mesajinin cikmadigini test eder
    And tarayiciyi kapatir.

