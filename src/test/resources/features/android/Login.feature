@Android @Login
Feature: As user, I have be able to success login, So that I can see home screen

  Background:
    Given user on login screen

  @Negative @Invalid-Phone-Number
  Scenario Outline: user input invalid phone number so that user can see error message
    When user input "<number>" on phone number field
    And user input "<password>" on password field
    And user click next button
    Then user see error message "<message>" at the bottom of phone number field

    Examples:
      |number                       |password        |message                                                                       |
      |11111111111111               |123456789       |Format nomor HP atau No. kartu member anda salah. Mohon periksa kembali       |
      |                             |123456789       |Nomor HP / No. kartu Member tidak boleh kosong                                |
      |089676073212                 |123456789       |Nomor handphone yang Anda masukkan belum terdaftar. Mohon periksa kembali.    |
      |08967                        |123456789       |Nomor HP harus di antara 10 hingga 16 digit                                   |

  @Negative @Invalid-Password
  Scenario Outline: user input invalid phone number so that user can see error message
    When user input "<number>" on phone number field
    And user input "<password>" on password field
    And user click next button
    Then user see error message "<message>" at the bottom of password field

    Examples:
      |number                       |password        |message                                                                       |
      |089676073212                 |                |Kolom ini diperlukan                                                          |
      |089676073212                 |123             |Password minimum 8 karakter.                                                  |