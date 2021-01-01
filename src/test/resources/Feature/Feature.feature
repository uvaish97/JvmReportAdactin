Feature: Verifying the adactin hotel login details

  Scenario Outline: Verifying the adactin hotel login details with valid credentials
    Given User is on the adactin login page
    When User should enter "<username>" and "<password>"
    And User should enter the Room Details"<location>","<hotel>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adults>"and"<child>"
    And user should click the search button
    And user should select the room by clicking radio button and click continue
    And user should enter the payment details"<firstName>","<lastName>","<address>"
    
      | cardNumber       | cardType         | month   | year | cvvNumber |
      | 1234567890123456 | VISA             | January | 2022 |       123 |
      | 1234567890134534 | American Express | March   | 2021 |       445 |
      | 1234567890122345 | Master Card      | June    | 2022 |       989 |
      | 1234567890122345 | Other            | July    | 2021 |       674 |
   
    And user should click the book now button
    And get order id in console
    Then user should click the my itenerary button

    Examples: 
      | username | password | location | hotel       | roomType | noOfRooms | checkInDate | checkOutDate | adults  | child   | firstName | lastName | address | 
      | uvaishjj | MCM9J3   | Sydney   | Hotel Creek | Standard | 2 - Two   | 17/12/2020  | 18/12/2020   | 2 - Two | 2 - Two | mohammed  | uvaish   | madurai | 