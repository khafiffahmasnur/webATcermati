
Feature: SignUp Cermati

  @tag1
  Scenario: Daftar ke Cermati.com
    Given user navigation to "https://www.cermati.com/gabung/"
    And user input email with "khafiffah@gmail.com"
    And user input kata sandi with "letmein123"
    And user input konfirmasi kata sandi with "letmein123"
    And user input nama depan with "Khafiffah"
    And user input nama belakang with "Masnur"
    And user input nomor telepon with "081327918093"
    When user input kabupaten/kota with "Kota Yogyakarta"
    Then user click button daftar akun
